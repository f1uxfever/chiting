# Cheat Menu Mod для Minecraft 1.16.5 (Fabric)

## Установка и Сборка

### Требования:
- Java 8 или выше
- Git (опционально)

### Инструкции по сборке:

1. **Скачайте все файлы в один проект:**
```bash
git clone <repo_url>
cd cheatmenu
```

2. **Соберите мод через Gradle:**
```bash
./gradlew build
```

На Windows:
```bash
gradlew.bat build
```

3. **JAR файл будет находиться в:**
```
build/libs/cheatmenu-1.0.0.jar
```

4. **Скопируйте JAR в папку mods Minecraft:**
```
%appdata%/.minecraft/mods/  (Windows)
~/.minecraft/mods/          (Linux/Mac)
```

5. **Запустите Minecraft с Fabric Loader 1.16.5**

## Использование

- **Откройте меню:** Right Shift
- **Переключайте вкладки:** Нажимайте на вкладки (Combat, Movement, Render, Misc)
- **Включайте модули:** Кликайте на модули для включения/выключения
- **Закрывайте меню:** ESC

## Функции

### Combat
- KillAura - автоматическая атака врагов
- TriggerBot - автоматический выстрел
- AutoClicker - автоматический клик

### Movement
- AutoSprint - автоматический спринт
- NoFall - защита от падения
- Speed - увеличение скорости
- Fly - полёт

### Render
- FullBright - яркость на максимум
- ESP - видение врагов через стены
- Tracers - линии к врагам
- HUD - информационный дисплей
- Coordinates - отображение координат

### Misc
- AutoFish - автоматическая рыбалка
- ChatSpam - спам в чате
- Timer - таймер игры

## Структура проекта

```
src/main/java/net/cheatmenu/
├── CheatMenuMod.java          # Главный класс мода
├── module/
│   ├── Module.java            # Базовый класс модуля
│   ├── ModuleManager.java     # Менеджер модулей
│   └── modules/               # Все модули
└── ui/
    └── ClickGUIScreen.java    # GUI интерфейс
```

## Компиляция

Для разработки и компиляции из IDE:
1. Откройте проект в IntelliJ IDEA или Eclipse
2. IntelliJ: Run -> gradle -> build
3. Или используйте команду в терминале: `./gradlew build`

## Требования к коду

- Java 8 compatible
- Fabric API для 1.16.5
- Gradle + Fabric Loom

## Лицензия

MIT

## Поддержка

Мод полностью функционален и готов к использованию.
