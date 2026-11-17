# ArithmeticMockMvc

A Spring Boot MVC arithmetic calculator tested with MockMvc and JUnit.

## Requirements
- JDK 17
- Spring Tool Suite (STS) or Eclipse with Spring Tools
- Internet connection for the first Maven dependency download

## Import into STS
1. Extract this ZIP file.
2. Open STS.
3. Select **File → Import → Maven → Existing Maven Projects**.
4. Browse to the extracted `ArithmeticMockMvc` folder.
5. Select the `pom.xml` and click **Finish**.
6. If prompted, right-click the project and select **Maven → Update Project**.

## Run tests without starting the embedded server
1. Expand `src/test/java`.
2. Right-click `ArithmeticControllerTest.java`.
3. Select **Run As → JUnit Test**.
4. The `@WebMvcTest` test slice uses MockMvc to test the MVC controller without starting an embedded Tomcat server.

The separate `ArithmeticMockMvcApplicationTests.java` uses `@SpringBootTest` and loads the application context. It is not needed for the MockMvc experiment; you can leave it in the project or delete it. For the experiment, run `ArithmeticControllerTest.java`.

## Endpoints tested
- `GET /calculator/add?a=10&b=20` → `30`
- `GET /calculator/subtract?a=20&b=10` → `10`
- `GET /calculator/multiply?a=5&b=4` → `20`
- `GET /calculator/divide?a=20&b=5` → `4.0`

## Push to GitHub
Create an empty repository on GitHub, then open a terminal in this project folder and run:

```bash
git init
git add .
git commit -m "Add arithmetic MockMvc experiment"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/ArithmeticMockMvc.git
git push -u origin main
```

Replace `YOUR_USERNAME` with your GitHub username.
