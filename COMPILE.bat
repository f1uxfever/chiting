@echo off
REM Скрипт компиляции Cheat Menu Moda для Windows
REM Просто запустите этот файл в папке проекта

echo.
echo ╔════════════════════════════════════════════╗
echo ║  Cheat Menu Mod - Компиляция для Windows  ║
echo ╚════════════════════════════════════════════╝
echo.

REM Проверяем Java
java -version >nul 2>&1
if errorlevel 1 (
    echo ❌ Java не найдена! Установите Java JDK с oracle.com
    pause
    exit /b 1
)

echo ✓ Java найдена

REM Проверяем Gradle
if exist "gradlew.bat" (
    echo ✓ Gradle Wrapper найден
    echo.
    echo ⏳ Компиляция... (это может занять несколько минут)
    echo.
    call gradlew.bat build
    if errorlevel 1 (
        echo.
        echo ❌ Ошибка компиляции!
        pause
        exit /b 1
    )
    echo.
    echo ✓ Компиляция завершена!
    echo.
    echo 📦 JAR файл создан: build\libs\cheatmenu-1.0.0.jar
    echo.
    echo Скопируйте этот файл в:
    echo   %%appdata%%\.minecraft\mods\cheatmenu-1.0.0.jar
    echo.
    echo Затем откройте Minecraft 1.16.5 с Fabric!
    pause
) else (
    echo ❌ gradlew.bat не найден
    echo Убедитесь что вы распаковали архив правильно
    pause
    exit /b 1
)
