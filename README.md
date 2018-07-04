to repoduce failure correct path to compiler in `gradle.porperties` and `settings.gradle`
````
	error: compilation failed: internal final fun onStartInternal(): kotlin.Unit defined in kotlinx.coroutines.experimental.AbstractCoroutine[DeserializedSimpleFunctionDescriptor@74431b9c]
	
	 * Source files: simple.kt
	 * Compiler version info: Konan: 0.8-dev / Kotlin: 1.2.70
	 * Output kind: LIBRARY
	
	exception: java.lang.AssertionError: internal final fun onStartInternal(): kotlin.Unit defined in kotlinx.coroutines.experimental.AbstractCoroutine[DeserializedSimpleFunctionDescriptor@74431b9c]
		at org.jetbrains.kotlin.backend.konan.llvm.BinaryInterfaceKt.getSymbolName(BinaryInterface.kt:204)
		at org.jetbrains.kotlin.backend.konan.llvm.ContextUtils$DefaultImpls.getLlvmFunction(ContextUtils.kt:171)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGenerator.getLlvmFunction(RTTIGenerator.kt:29)
		at org.jetbrains.kotlin.backend.konan.llvm.ContextUtils$DefaultImpls.getEntryPointAddress(ContextUtils.kt:183)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGenerator.getEntryPointAddress(RTTIGenerator.kt:29)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGenerator.methodTableRecords(RTTIGenerator.kt:257)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGenerator.generate(RTTIGenerator.kt:196)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGeneratorVisitor.visitClass(IrToBitcode.kt:171)
		at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitClass(IrElementVisitorVoid.kt:44)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGeneratorVisitor.visitClass(IrToBitcode.kt:153)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGeneratorVisitor.visitClass(IrToBitcode.kt:153)
		at org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl.accept(IrClassImpl.kt:100)
		at org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.acceptChildren(IrFileImpl.kt:79)
		at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoidKt.acceptChildrenVoid(IrElementVisitorVoid.kt:251)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGeneratorVisitor.visitElement(IrToBitcode.kt:159)
		at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitPackageFragment(IrElementVisitorVoid.kt:30)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGeneratorVisitor.visitPackageFragment(IrToBitcode.kt:153)
		at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitFile(IrElementVisitorVoid.kt:37)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGeneratorVisitor.visitFile(IrToBitcode.kt:153)
		at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitFile(IrElementVisitorVoid.kt:38)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGeneratorVisitor.visitFile(IrToBitcode.kt:153)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGeneratorVisitor.visitFile(IrToBitcode.kt:153)
		at org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.accept(IrFileImpl.kt:76)
		at org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.acceptChildren(IrModuleFragmentImpl.kt:49)
		at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoidKt.acceptChildrenVoid(IrElementVisitorVoid.kt:251)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGeneratorVisitor.visitElement(IrToBitcode.kt:159)
		at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitModuleFragment(IrElementVisitorVoid.kt:27)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGeneratorVisitor.visitModuleFragment(IrToBitcode.kt:153)
		at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitModuleFragment(IrElementVisitorVoid.kt:28)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGeneratorVisitor.visitModuleFragment(IrToBitcode.kt:153)
		at org.jetbrains.kotlin.backend.konan.llvm.RTTIGeneratorVisitor.visitModuleFragment(IrToBitcode.kt:153)
		at org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.accept(IrModuleFragmentImpl.kt:46)
		at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoidKt.acceptVoid(IrElementVisitorVoid.kt:247)
		at org.jetbrains.kotlin.backend.konan.llvm.IrToBitcodeKt$emitLLVM$1.invoke(IrToBitcode.kt:71)
		at org.jetbrains.kotlin.backend.konan.llvm.IrToBitcodeKt$emitLLVM$1.invoke(IrToBitcode.kt)
		at org.jetbrains.kotlin.backend.konan.PhaseManager$phase$$inlined$with$lambda$1.invoke(KonanPhases.kt:139)
		at org.jetbrains.kotlin.backend.konan.PhaseManager$phase$$inlined$with$lambda$1.invoke(KonanPhases.kt:118)
		at org.jetbrains.kotlin.konan.util.UtilKt.profileIf(Util.kt:34)
		at org.jetbrains.kotlin.backend.konan.PhaseManager.phase$backend_native_compiler(KonanPhases.kt:138)
		at org.jetbrains.kotlin.backend.konan.llvm.IrToBitcodeKt.emitLLVM(IrToBitcode.kt:70)
		at org.jetbrains.kotlin.backend.konan.KonanDriverKt$runTopLevelPhases$4$2.invoke(KonanDriver.kt:97)
		at org.jetbrains.kotlin.backend.konan.KonanDriverKt$runTopLevelPhases$4$2.invoke(KonanDriver.kt)
		at org.jetbrains.kotlin.backend.konan.PhaseManager$phase$$inlined$with$lambda$1.invoke(KonanPhases.kt:139)
		at org.jetbrains.kotlin.backend.konan.PhaseManager$phase$$inlined$with$lambda$1.invoke(KonanPhases.kt:118)
		at org.jetbrains.kotlin.konan.util.UtilKt.profileIf(Util.kt:34)
		at org.jetbrains.kotlin.backend.konan.PhaseManager.phase$backend_native_compiler(KonanPhases.kt:138)
		at org.jetbrains.kotlin.backend.konan.KonanDriverKt$runTopLevelPhases$4.invoke(KonanDriver.kt:96)
		at org.jetbrains.kotlin.backend.konan.KonanDriverKt$runTopLevelPhases$4.invoke(KonanDriver.kt)
		at org.jetbrains.kotlin.backend.konan.PhaseManager$phase$$inlined$with$lambda$1.invoke(KonanPhases.kt:139)
		at org.jetbrains.kotlin.backend.konan.PhaseManager$phase$$inlined$with$lambda$1.invoke(KonanPhases.kt:118)
		at org.jetbrains.kotlin.konan.util.UtilKt.profileIf(Util.kt:34)
		at org.jetbrains.kotlin.backend.konan.PhaseManager.phase$backend_native_compiler(KonanPhases.kt:138)
		at org.jetbrains.kotlin.backend.konan.KonanDriverKt.runTopLevelPhases(KonanDriver.kt:90)
		at org.jetbrains.kotlin.cli.bc.K2Native.doExecute(K2Native.kt:75)
		at org.jetbrains.kotlin.cli.bc.K2Native.doExecute(K2Native.kt:42)
		at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.java:95)
		at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.java:50)
		at org.jetbrains.kotlin.cli.common.CLITool.exec(CLITool.kt:88)
		at org.jetbrains.kotlin.cli.common.CLITool.exec(CLITool.kt:66)
		at org.jetbrains.kotlin.cli.common.CLITool.exec(CLITool.kt:34)
		at org.jetbrains.kotlin.cli.common.CLITool$Companion.doMainNoExit(CLITool.kt:180)
		at org.jetbrains.kotlin.cli.common.CLITool$Companion.doMain(CLITool.kt:171)
		at org.jetbrains.kotlin.cli.bc.K2Native$Companion$main$1.invoke(K2Native.kt:197)
		at org.jetbrains.kotlin.cli.bc.K2Native$Companion$main$1.invoke(K2Native.kt:188)
		at org.jetbrains.kotlin.konan.util.UtilKt.profileIf(Util.kt:34)
		at org.jetbrains.kotlin.konan.util.UtilKt.profile(Util.kt:29)
		at org.jetbrains.kotlin.cli.bc.K2Native$Companion.main(K2Native.kt:190)
		at org.jetbrains.kotlin.cli.bc.K2NativeKt.main(K2Native.kt:202)
		at org.jetbrains.kotlin.cli.utilities.MainKt.main(main.kt:27)
	
	
	> Task :compileKonanTestMacos_x64 FAILED
	
	FAILURE: Build failed with an exception.
	
	* What went wrong:
	Execution failed for task ':compileKonanTestMacos_x64'.
	> Process 'command '/Library/Java/JavaVirtualMachines/jdk-10.0.1.jdk/Contents/Home/bin/java'' finished with non-zero exit value 2
	
	* Try:
	Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.
	
	* Get more help at https://help.gradle.org
	
	BUILD FAILED in 8s
	2 actionable tasks: 2 executed
````
