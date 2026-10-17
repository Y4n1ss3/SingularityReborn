package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.retain.LocalRetainedValuesStoreKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.er;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class CompositionLocalsKt {
    private static final ProvidableCompositionLocal<AccessibilityManager> LocalAccessibilityManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAccessibilityManager$1.INSTANCE);
    private static final ProvidableCompositionLocal<Autofill> LocalAutofill = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAutofill$1.INSTANCE);
    private static final ProvidableCompositionLocal<AutofillTree> LocalAutofillTree = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAutofillTree$1.INSTANCE);
    private static final ProvidableCompositionLocal<AutofillManager> LocalAutofillManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAutofillManager$1.INSTANCE);
    private static final ProvidableCompositionLocal<ClipboardManager> LocalClipboardManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalClipboardManager$1.INSTANCE);
    private static final ProvidableCompositionLocal<Clipboard> LocalClipboard = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalClipboard$1.INSTANCE);
    private static final ProvidableCompositionLocal<GraphicsContext> LocalGraphicsContext = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalGraphicsContext$1.INSTANCE);
    private static final ProvidableCompositionLocal<Density> LocalDensity = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalDensity$1.INSTANCE);
    private static final ProvidableCompositionLocal<FocusManager> LocalFocusManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFocusManager$1.INSTANCE);
    private static final ProvidableCompositionLocal<Font.ResourceLoader> LocalFontLoader = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFontLoader$1.INSTANCE);
    private static final ProvidableCompositionLocal<FontFamily.Resolver> LocalFontFamilyResolver = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFontFamilyResolver$1.INSTANCE);
    private static final ProvidableCompositionLocal<HapticFeedback> LocalHapticFeedback = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalHapticFeedback$1.INSTANCE);
    private static final ProvidableCompositionLocal<InputModeManager> LocalInputModeManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalInputModeManager$1.INSTANCE);
    private static final ProvidableCompositionLocal<LayoutDirection> LocalLayoutDirection = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalLayoutDirection$1.INSTANCE);
    private static final ProvidableCompositionLocal<LocaleList> LocalProvidableLocaleList = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalProvidableLocaleList$1.INSTANCE);
    private static final CompositionLocal<Locale> LocalLocale = CompositionLocalKt.compositionLocalWithComputedDefaultOf(CompositionLocalsKt$LocalLocale$1.INSTANCE);
    private static final ProvidableCompositionLocal<TextInputService> LocalTextInputService = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalTextInputService$1.INSTANCE);
    private static final ProvidableCompositionLocal<SoftwareKeyboardController> LocalSoftwareKeyboardController = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalSoftwareKeyboardController$1.INSTANCE);
    private static final ProvidableCompositionLocal<TextToolbar> LocalTextToolbar = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalTextToolbar$1.INSTANCE);
    private static final ProvidableCompositionLocal<UriHandler> LocalUriHandler = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalUriHandler$1.INSTANCE);
    private static final ProvidableCompositionLocal<ViewConfiguration> LocalViewConfiguration = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalViewConfiguration$1.INSTANCE);
    private static final ProvidableCompositionLocal<WindowInfo> LocalWindowInfo = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalWindowInfo$1.INSTANCE);
    private static final ProvidableCompositionLocal<PointerIconService> LocalPointerIconService = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalPointerIconService$1.INSTANCE);
    private static final ProvidableCompositionLocal<Boolean> LocalProvidableScrollCaptureInProgress = CompositionLocalKt.compositionLocalOf$default(null, CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1.INSTANCE, 1, null);
    private static final ProvidableCompositionLocal<Boolean> LocalCursorBlinkEnabled = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalCursorBlinkEnabled$1.INSTANCE);

    public static final void ProvideCommonCompositionLocals(Owner owner, UriHandler uriHandler, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1925803616);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(owner) : startRestartGroup.changedInstance(owner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(uriHandler) : startRestartGroup.changedInstance(uriHandler) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1925803616, i2, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:235)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalAccessibilityManager.provides(owner.getAccessibilityManager()), LocalAutofill.provides(owner.getAutofill()), LocalAutofillManager.provides(owner.getAutofillManager()), LocalAutofillTree.provides(owner.getAutofillTree()), LocalClipboardManager.provides(owner.getClipboardManager()), LocalClipboard.provides(owner.getClipboard()), LocalDensity.provides(owner.getDensity()), LocalFocusManager.provides(owner.getFocusOwner()), LocalFontLoader.providesDefault(owner.getFontLoader()), LocalFontFamilyResolver.providesDefault(owner.getFontFamilyResolver()), LocalHapticFeedback.provides(owner.getHapticFeedBack()), LocalInputModeManager.provides(owner.getInputModeManager()), LocalLayoutDirection.provides(owner.getLayoutDirection()), LocalTextInputService.provides(owner.getTextInputService()), LocalSoftwareKeyboardController.provides(owner.getSoftwareKeyboardController()), LocalTextToolbar.provides(owner.getTextToolbar()), LocalUriHandler.provides(uriHandler), LocalViewConfiguration.provides(owner.getViewConfiguration()), LocalWindowInfo.provides(owner.getWindowInfo()), LocalPointerIconService.provides(owner.getPointerIconService()), LocalGraphicsContext.provides(owner.getGraphicsContext()), LocalRetainedValuesStoreKt.getLocalRetainedValuesStore().provides(owner.getRetainedValuesStore()), LocalProvidableLocaleList.provides(owner.getLocaleList())}, myVar, startRestartGroup, ((i2 >> 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CompositionLocalsKt$ProvideCommonCompositionLocals$1(owner, uriHandler, myVar, i));
        }
    }

    public static final ProvidableCompositionLocal<AccessibilityManager> getLocalAccessibilityManager() {
        return LocalAccessibilityManager;
    }

    public static final ProvidableCompositionLocal<Autofill> getLocalAutofill() {
        return LocalAutofill;
    }

    public static final ProvidableCompositionLocal<AutofillManager> getLocalAutofillManager() {
        return LocalAutofillManager;
    }

    public static final ProvidableCompositionLocal<AutofillTree> getLocalAutofillTree() {
        return LocalAutofillTree;
    }

    public static final ProvidableCompositionLocal<Clipboard> getLocalClipboard() {
        return LocalClipboard;
    }

    public static final ProvidableCompositionLocal<ClipboardManager> getLocalClipboardManager() {
        return LocalClipboardManager;
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalCursorBlinkEnabled() {
        return LocalCursorBlinkEnabled;
    }

    public static final ProvidableCompositionLocal<Density> getLocalDensity() {
        return LocalDensity;
    }

    public static final ProvidableCompositionLocal<FocusManager> getLocalFocusManager() {
        return LocalFocusManager;
    }

    public static final ProvidableCompositionLocal<FontFamily.Resolver> getLocalFontFamilyResolver() {
        return LocalFontFamilyResolver;
    }

    public static final ProvidableCompositionLocal<Font.ResourceLoader> getLocalFontLoader() {
        return LocalFontLoader;
    }

    public static final ProvidableCompositionLocal<GraphicsContext> getLocalGraphicsContext() {
        return LocalGraphicsContext;
    }

    public static final ProvidableCompositionLocal<HapticFeedback> getLocalHapticFeedback() {
        return LocalHapticFeedback;
    }

    public static final ProvidableCompositionLocal<InputModeManager> getLocalInputModeManager() {
        return LocalInputModeManager;
    }

    public static final ProvidableCompositionLocal<LayoutDirection> getLocalLayoutDirection() {
        return LocalLayoutDirection;
    }

    public static final CompositionLocal<Locale> getLocalLocale() {
        return LocalLocale;
    }

    public static final CompositionLocal<LocaleList> getLocalLocaleList() {
        return LocalProvidableLocaleList;
    }

    public static final ProvidableCompositionLocal<PointerIconService> getLocalPointerIconService() {
        return LocalPointerIconService;
    }

    public static final ProvidableCompositionLocal<LocaleList> getLocalProvidableLocaleList() {
        return LocalProvidableLocaleList;
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalProvidableScrollCaptureInProgress() {
        return LocalProvidableScrollCaptureInProgress;
    }

    public static final CompositionLocal<Boolean> getLocalScrollCaptureInProgress() {
        return LocalProvidableScrollCaptureInProgress;
    }

    public static final ProvidableCompositionLocal<SoftwareKeyboardController> getLocalSoftwareKeyboardController() {
        return LocalSoftwareKeyboardController;
    }

    public static final ProvidableCompositionLocal<TextInputService> getLocalTextInputService() {
        return LocalTextInputService;
    }

    public static final ProvidableCompositionLocal<TextToolbar> getLocalTextToolbar() {
        return LocalTextToolbar;
    }

    public static final ProvidableCompositionLocal<UriHandler> getLocalUriHandler() {
        return LocalUriHandler;
    }

    public static final ProvidableCompositionLocal<ViewConfiguration> getLocalViewConfiguration() {
        return LocalViewConfiguration;
    }

    public static final ProvidableCompositionLocal<WindowInfo> getLocalWindowInfo() {
        return LocalWindowInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @er
    public static /* synthetic */ void getLocalAutofill$annotations() {
    }

    @er
    public static /* synthetic */ void getLocalAutofillTree$annotations() {
    }

    @er
    public static /* synthetic */ void getLocalClipboardManager$annotations() {
    }

    @er
    public static /* synthetic */ void getLocalFontLoader$annotations() {
    }

    @er
    public static /* synthetic */ void getLocalTextInputService$annotations() {
    }
}
