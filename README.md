# Quiz App 🎮

A dynamic and interactive Android Quiz Application inspired by the KBC (Kaun Banega Crorepati) style, featuring real-time scoring, dynamic timers, and immersive audio effects.

## 🚀 Features

- **Dynamic Question Loading:** Fetches questions dynamically from a repository, allowing for easy updates and expansion.
- **KBC Style UI:** Immersive dark theme with gold accents and customized option backgrounds.
- **Adaptive Timer:** The countdown timer automatically synchronizes its duration with the length of the background audio track.
- **Real-time Scoring:** Instantly calculates scores and provides feedback with visual cues (Green for correct, Red for wrong).
- **Audio Feedback:** 
  - Ticking timer sound during questions.
  - Distinct sound effects for correct and incorrect answers.
- **Result Summary:** Comprehensive results screen showing total score, performance percentage, and a review of correct answers.

## 🛠️ Tech Stack

- **Language:** Kotlin
- **UI Framework:** XML (ConstraintLayout, Material Components)
- **Architecture:** Imperative/Procedural (Activity-based)
- **Media:** Android MediaPlayer API for sound effects.

## 📂 Project Structure

- `QuizActivity.kt`: Manages the quiz lifecycle, timer logic, and audio playback.
- `ResultActivity.kt`: Calculates and displays final performance metrics and answer keys.
- `QuestionRepository.kt`: Centralized source for quiz content.
- `res/raw/`: Contains audio assets (`timer_sound.mp3`, `correct_sound.mp3`, `wrong_sound.mp3`).

## ⚙️ Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/bakchodi.git
   ```
2. **Add Audio Assets:**
   Place your audio files in `app/src/main/res/raw/`:
   - `timer_sound.mp3`
   - `correct_sound.mp3`
   - `wrong_sound.mp3`
3. **Build & Run:**
   Open the project in Android Studio and click the **Run** button.

## 📝 License

This project is for educational purposes. Feel free to use and modify it!
