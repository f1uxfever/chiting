#!/bin/bash
echo "╔════════════════════════════════════════════╗"
echo "║ Cheat Menu Mod - Компиляция для Linux/Mac║"
echo "╚════════════════════════════════════════════╝"
echo ""

if ! command -v java &> /dev/null; then
    echo "❌ Java не найдена! Установите Java JDK"
    exit 1
fi

echo "✓ Java найдена"
echo ""
echo "⏳ Компиляция... (это может занять несколько минут)"
echo ""

./gradlew build

if [ $? -eq 0 ]; then
    echo ""
    echo "✓ Компиляция завершена!"
    echo ""
    echo "📦 JAR файл создан: build/libs/cheatmenu-1.0.0.jar"
    echo ""
    echo "Скопируйте этот файл в:"
    echo "  ~/.minecraft/mods/cheatmenu-1.0.0.jar"
    echo ""
    echo "Затем откройте Minecraft 1.16.5 с Fabric!"
else
    echo ""
    echo "❌ Ошибка компиляции!"
    exit 1
fi
