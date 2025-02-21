# LineFollowerBot

## Overview

LineFollowerBot is an autonomous robot designed to follow a predefined path using sensor inputs. It's an excellent project for understanding the basics of robotics, sensor integration, and control systems.

## Features

- Autonomously follows a line path.
- Real-time sensor data processing.
- Adjustable speed and sensitivity settings.

## Hardware Requirements

- Arduino UNO
- IR Sensor Array
- Motor Driver (e.g., L298N)
- DC Motors with Wheels
- Chassis for mounting components
- Power Supply (e.g., battery pack)

## Software Requirements

- Arduino IDE
- [LineFollowerBot Repository](https://github.com/Srianshu-1402/LineFollowerBot)

## Setup Instructions

1. **Hardware Assembly**:
    - Mount the IR sensor array at the front underside of the chassis, ensuring it faces the ground.
    - Connect the motors to the motor driver and then to the Arduino UNO.
    - Connect the IR sensors to the Arduino's analog/digital pins as per your circuit design.
    - Ensure all components are securely attached to the chassis and wired correctly.

2. **Software Installation**:
    - Clone or download the [LineFollowerBot repository](https://github.com/Srianshu-1402/LineFollowerBot) to your local machine.
    - Open the Arduino IDE and load the `LineFollowerBot.ino` file from the `src` directory.
    - Install any necessary libraries if prompted by the Arduino IDE.

3. **Uploading the Code**:
    - Connect your Arduino UNO to your computer via USB.
    - Select the appropriate board and port from the Arduino IDE.
    - Click on the upload button to flash the code onto the Arduino.

4. **Calibration**:
    - Place the robot on the track with the line it needs to follow.
    - Adjust sensor thresholds in the code if necessary to ensure accurate line detection.
    - Test the robot's response and fine-tune parameters like speed and sensitivity as needed.

## Usage

- Place the robot at the starting point of the line track.
- Turn on the power supply.
- The robot will begin to follow the line autonomously.
- Monitor its performance and make any necessary adjustments to the code or hardware setup.

## Contributing

Contributions are welcome! If you have suggestions for improvements or new features, feel free to open an issue or submit a pull request.


## Acknowledgments

- Inspired by various open-source line follower robot projects and tutorials.
- Special thanks to the robotics community for their continuous support and knowledge sharing.
