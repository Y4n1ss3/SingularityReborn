package androidx.compose.ui.platform;

import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.HostDefaultProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.compose.ui.res.ResourceIdCache;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.unit.IntSize;
import defpackage.a21;
import defpackage.dq;
import defpackage.hl0;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.n20;
import defpackage.o;
import defpackage.p01;
import defpackage.q10;
import defpackage.t20;
import defpackage.w01;
import defpackage.x50;
import defpackage.y40;
import defpackage.y80;
import defpackage.z50;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ComposeViewContext {
    public static final int $stable = 8;
    private final AndroidAccessibilityManager accessibilityManager;
    private final iy calculateWindowSizeLambda;
    private final ComposeViewContext$callback$1 callback;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboard clipboard;
    private final AndroidClipboardManager clipboardManager;
    private final CompositionContext compositionContext;
    private final MutableState<Configuration> configuration;
    private final Configuration currentConfiguration;
    private final MutableState<FontFamily.Resolver> fontFamilyResolver;
    private final Font.ResourceLoader fontLoader;
    private final HapticFeedback hapticFeedback;
    private final ImageVectorCache imageVectorCache;
    private final y40 lifecycleOwner;
    private final ResourceIdCache resourceIdCache;
    private final hl0 savedStateRegistryOwner;
    private final LayoutNodeDrawScope sharedDrawScope;
    private long testWindowSize;
    private final AndroidUriHandler uriHandler;
    private final View view;
    private final AndroidViewConfiguration viewConfiguration;
    private int viewCount;
    private final a21 viewModelStoreOwner;
    private final LazyWindowInfo windowInfo;

    /* JADX WARN: Multi-variable type inference failed */
    private ComposeViewContext(ComposeViewContext composeViewContext, View view, CompositionContext compositionContext, y40 y40Var, hl0 hl0Var, a21 a21Var, boolean z) {
        ImageVectorCache imageVectorCache;
        Configuration configuration;
        MutableState<Configuration> mutableStateOf$default;
        AndroidAccessibilityManager androidAccessibilityManager;
        AndroidUriHandler androidUriHandler;
        AndroidClipboardManager androidClipboardManager;
        AndroidClipboard androidClipboard;
        Font.ResourceLoader androidFontResourceLoader;
        MutableState<FontFamily.Resolver> mutableStateOf;
        AndroidViewConfiguration androidViewConfiguration;
        CanvasHolder canvasHolder;
        LayoutNodeDrawScope layoutNodeDrawScope;
        ResourceIdCache resourceIdCache;
        this.view = view;
        this.compositionContext = compositionContext;
        this.lifecycleOwner = y40Var;
        this.savedStateRegistryOwner = hl0Var;
        this.viewModelStoreOwner = a21Var;
        if (z) {
            composeViewContext.getClass();
            imageVectorCache = composeViewContext.imageVectorCache;
        } else {
            imageVectorCache = new ImageVectorCache();
        }
        this.imageVectorCache = imageVectorCache;
        this.resourceIdCache = (composeViewContext == null || (resourceIdCache = composeViewContext.resourceIdCache) == null) ? new ResourceIdCache() : resourceIdCache;
        if (z) {
            composeViewContext.getClass();
            configuration = composeViewContext.currentConfiguration;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.currentConfiguration = configuration;
        CanvasDrawScope canvasDrawScope = null;
        Object[] objArr = 0;
        if (z) {
            composeViewContext.getClass();
            mutableStateOf$default = composeViewContext.configuration;
        } else {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Configuration(configuration), null, 2, null);
        }
        this.configuration = mutableStateOf$default;
        if (z) {
            composeViewContext.getClass();
            androidAccessibilityManager = composeViewContext.accessibilityManager;
        } else {
            androidAccessibilityManager = new AndroidAccessibilityManager(view.getContext());
        }
        this.accessibilityManager = androidAccessibilityManager;
        if (z) {
            composeViewContext.getClass();
            androidUriHandler = composeViewContext.uriHandler;
        } else {
            androidUriHandler = new AndroidUriHandler(view.getContext());
        }
        this.uriHandler = androidUriHandler;
        if (z) {
            composeViewContext.getClass();
            androidClipboardManager = composeViewContext.clipboardManager;
        } else {
            androidClipboardManager = new AndroidClipboardManager(view.getContext());
        }
        this.clipboardManager = androidClipboardManager;
        if (z) {
            composeViewContext.getClass();
            androidClipboard = composeViewContext.clipboard;
        } else {
            androidClipboard = new AndroidClipboard(androidClipboardManager);
        }
        this.clipboard = androidClipboard;
        if (z) {
            composeViewContext.getClass();
            androidFontResourceLoader = composeViewContext.fontLoader;
        } else {
            androidFontResourceLoader = new AndroidFontResourceLoader(view.getContext());
        }
        this.fontLoader = androidFontResourceLoader;
        if (z) {
            composeViewContext.getClass();
            mutableStateOf = composeViewContext.fontFamilyResolver;
        } else {
            mutableStateOf = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(view.getContext()), SnapshotStateKt.referentialEqualityPolicy());
        }
        this.fontFamilyResolver = mutableStateOf;
        this.hapticFeedback = view == (composeViewContext != null ? composeViewContext.view : null) ? composeViewContext.hapticFeedback : new PlatformHapticFeedback(view);
        if (z) {
            composeViewContext.getClass();
            androidViewConfiguration = composeViewContext.viewConfiguration;
        } else {
            androidViewConfiguration = new AndroidViewConfiguration(android.view.ViewConfiguration.get(view.getContext()));
        }
        this.viewConfiguration = androidViewConfiguration;
        this.sharedDrawScope = (composeViewContext == null || (layoutNodeDrawScope = composeViewContext.sharedDrawScope) == null) ? new LayoutNodeDrawScope(canvasDrawScope, 1, objArr == true ? 1 : 0) : layoutNodeDrawScope;
        this.windowInfo = new LazyWindowInfo();
        this.canvasHolder = (composeViewContext == null || (canvasHolder = composeViewContext.canvasHolder) == null) ? new CanvasHolder() : canvasHolder;
        this.testWindowSize = IntSize.Companion.m7787getZeroYbymL2g();
        this.calculateWindowSizeLambda = new ComposeViewContext$calculateWindowSizeLambda$1(this);
        this.callback = new ComposeViewContext$callback$1(this);
    }

    public static /* synthetic */ ComposeViewContext copy$default(ComposeViewContext composeViewContext, View view, CompositionContext compositionContext, y40 y40Var, hl0 hl0Var, a21 a21Var, int i, Object obj) {
        if ((i & 1) != 0) {
            view = composeViewContext.view;
        }
        if ((i & 2) != 0) {
            compositionContext = composeViewContext.compositionContext;
        }
        if ((i & 4) != 0) {
            y40Var = composeViewContext.lifecycleOwner;
        }
        if ((i & 8) != 0) {
            hl0Var = composeViewContext.savedStateRegistryOwner;
        }
        if ((i & 16) != 0) {
            a21Var = composeViewContext.viewModelStoreOwner;
        }
        a21 a21Var2 = a21Var;
        y40 y40Var2 = y40Var;
        return composeViewContext.copy(view, compositionContext, y40Var2, hl0Var, a21Var2);
    }

    private final void startObserving() {
        this.view.getContext().registerComponentCallbacks(this.callback);
        onConfigurationChanged$ui(this.view.getResources().getConfiguration());
        this.windowInfo.setWindowFocused(this.view.hasWindowFocus());
        this.windowInfo.setOnInitializeContainerSize(this.calculateWindowSizeLambda);
        LazyWindowInfo lazyWindowInfo = this.windowInfo;
        iy iyVar = this.calculateWindowSizeLambda;
        MutableState mutableState = lazyWindowInfo._containerSize;
        if (mutableState != null) {
            mutableState.setValue(iyVar.invoke());
        }
        this.view.getViewTreeObserver().addOnWindowFocusChangeListener(this.callback);
    }

    private final void stopObserving() {
        this.view.getContext().unregisterComponentCallbacks(this.callback);
        this.windowInfo.setOnInitializeContainerSize(null);
        this.view.getViewTreeObserver().removeOnWindowFocusChangeListener(this.callback);
    }

    public final void ProvideCompositionLocals$ui(AndroidComposeView androidComposeView, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(123858079);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(androidComposeView) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(this) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(123858079, i2, -1, "androidx.compose.ui.platform.ComposeViewContext.ProvideCompositionLocals (ComposeViewContext.android.kt:403)");
            }
            Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
            Set<CompositionData> set = null;
            Set<CompositionData> set2 = (!(tag instanceof Set) || ((tag instanceof n20) && !(tag instanceof t20))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof n20) || (tag2 instanceof t20))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(startRestartGroup.getCompositionData());
                startRestartGroup.collectParameterInformation();
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(androidComposeView, this.savedStateRegistryOwner);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) rememberedValue;
            boolean changedInstance = startRestartGroup.changedInstance(disposableSaveableStateRegistry);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new ComposeViewContext$ProvideCompositionLocals$1$1(disposableSaveableStateRegistry);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.DisposableEffect(w01.a, (ky) rememberedValue2, startRestartGroup, 6);
            boolean booleanValue = ((Boolean) startRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui();
            boolean changed = startRestartGroup.changed(androidComposeView.getView());
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new ViewTreeHostDefaultProvider(androidComposeView.getView());
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{x50.a.provides(this.lifecycleOwner), z50.a.provides(this.savedStateRegistryOwner), AndroidCompositionLocals_androidKt.getLocalImageVectorCache().provides(this.imageVectorCache), AndroidCompositionLocals_androidKt.getLocalResourceIdCache().provides(this.resourceIdCache), AndroidCompositionLocals_androidKt.getLocalContext().provides(androidComposeView.getContext()), InspectionTablesKt.getLocalInspectionTables().provides(set), AndroidCompositionLocals_androidKt.getLocalConfiguration().provides(androidComposeView.getConfiguration()), SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(disposableSaveableStateRegistry), AndroidCompositionLocals_androidKt.getLocalView().provides(androidComposeView.getView()), CompositionLocalsKt.getLocalProvidableScrollCaptureInProgress().provides(Boolean.valueOf(booleanValue)), CompositionLocalsKt.getLocalViewConfiguration().provides(androidComposeView.getViewConfiguration()), HostDefaultProviderKt.getLocalHostDefaultProvider().provides((ViewTreeHostDefaultProvider) rememberedValue3)}, ComposableLambdaKt.rememberComposableLambda(1317454175, true, new ComposeViewContext$ProvideCompositionLocals$2(androidComposeView, this, myVar), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposeViewContext$ProvideCompositionLocals$3(this, androidComposeView, myVar, i));
        }
    }

    public final ComposeViewContext copy(View view, CompositionContext compositionContext, y40 y40Var, hl0 hl0Var, a21 a21Var) {
        return new ComposeViewContext(this, view, compositionContext, y40Var, hl0Var, a21Var, false, 64, null);
    }

    public final void decrementViewCount$ui() {
        int i = this.viewCount - 1;
        this.viewCount = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            i = 0;
            this.viewCount = 0;
        }
        if (i == 0) {
            stopObserving();
        }
    }

    public final AndroidAccessibilityManager getAccessibilityManager$ui() {
        return this.accessibilityManager;
    }

    public final CanvasHolder getCanvasHolder$ui() {
        return this.canvasHolder;
    }

    public final AndroidClipboard getClipboard$ui() {
        return this.clipboard;
    }

    public final AndroidClipboardManager getClipboardManager$ui() {
        return this.clipboardManager;
    }

    public final CompositionContext getCompositionContext$ui() {
        return this.compositionContext;
    }

    public final MutableState<Configuration> getConfiguration$ui() {
        return this.configuration;
    }

    public final MutableState<FontFamily.Resolver> getFontFamilyResolver$ui() {
        return this.fontFamilyResolver;
    }

    public final Font.ResourceLoader getFontLoader$ui() {
        return this.fontLoader;
    }

    public final HapticFeedback getHapticFeedback$ui() {
        return this.hapticFeedback;
    }

    public final ImageVectorCache getImageVectorCache$ui() {
        return this.imageVectorCache;
    }

    public final y40 getLifecycleOwner$ui() {
        return this.lifecycleOwner;
    }

    public final ResourceIdCache getResourceIdCache$ui() {
        return this.resourceIdCache;
    }

    public final hl0 getSavedStateRegistryOwner$ui() {
        return this.savedStateRegistryOwner;
    }

    public final LayoutNodeDrawScope getSharedDrawScope$ui() {
        return this.sharedDrawScope;
    }

    /* renamed from: getTestWindowSize-YbymL2g$ui, reason: not valid java name */
    public final long m6726getTestWindowSizeYbymL2g$ui() {
        return this.testWindowSize;
    }

    public final AndroidUriHandler getUriHandler$ui() {
        return this.uriHandler;
    }

    public final View getView$ui() {
        return this.view;
    }

    public final AndroidViewConfiguration getViewConfiguration$ui() {
        return this.viewConfiguration;
    }

    public final int getViewCount$ui() {
        return this.viewCount;
    }

    public final a21 getViewModelStoreOwner$ui() {
        return this.viewModelStoreOwner;
    }

    public final LazyWindowInfo getWindowInfo$ui() {
        return this.windowInfo;
    }

    public final void incrementViewCount$ui() {
        int i = this.viewCount + 1;
        this.viewCount = i;
        if (i == 1) {
            startObserving();
        }
    }

    public final void onConfigurationChanged$ui(Configuration configuration) {
        int updateFrom = this.currentConfiguration.updateFrom(configuration);
        if (updateFrom != 0) {
            this.imageVectorCache.prune(updateFrom);
            this.configuration.setValue(new Configuration(configuration));
            this.resourceIdCache.clear();
            if ((268435456 & updateFrom) != 0) {
                this.fontFamilyResolver.setValue(FontFamilyResolver_androidKt.createFontFamilyResolver(this.view.getContext()));
            }
            if (((-1342235264) & updateFrom) != 0) {
                LazyWindowInfo lazyWindowInfo = this.windowInfo;
                iy iyVar = this.calculateWindowSizeLambda;
                MutableState mutableState = lazyWindowInfo._containerSize;
                if (mutableState != null) {
                    mutableState.setValue(iyVar.invoke());
                }
            }
        }
    }

    /* renamed from: setTestWindowSize-ozmzZPI$ui, reason: not valid java name */
    public final void m6727setTestWindowSizeozmzZPI$ui(long j) {
        this.testWindowSize = j;
    }

    public static /* synthetic */ void getFontLoader$ui$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ComposeViewContext(ComposeViewContext composeViewContext, View view, CompositionContext compositionContext, y40 y40Var, hl0 hl0Var, a21 a21Var, boolean z, int i, dq dqVar) {
        this(composeViewContext, view, compositionContext, y40Var, hl0Var, a21Var, z);
        View view2;
        if ((i & 64) != 0) {
            z = q10.b((composeViewContext == null || (view2 = composeViewContext.view) == null) ? null : view2.getContext(), view.getContext());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ComposeViewContext(View view, CompositionContext compositionContext, y40 y40Var, hl0 hl0Var, a21 a21Var, int i, dq dqVar) {
        this(view, r2, r3, hl0Var, (i & 16) != 0 ? p01.n(view) : a21Var);
        if ((i & 2) != 0 && (compositionContext = WindowRecomposer_androidKt.findViewTreeCompositionContext(view)) == null) {
            compositionContext = WindowRecomposer_androidKt.getWindowRecomposer(view);
        }
        CompositionContext compositionContext2 = compositionContext;
        if ((i & 4) != 0 && (y40Var = q10.o(view)) == null) {
            o.f("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
            throw null;
        }
        y40 y40Var2 = y40Var;
        if ((i & 8) != 0 && (hl0Var = y80.t(view)) == null) {
            o.f("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
            throw null;
        }
    }

    public ComposeViewContext(View view, CompositionContext compositionContext, y40 y40Var, hl0 hl0Var, a21 a21Var) {
        this(ComposeView_androidKt.findViewTreeComposeViewContext(view), view, compositionContext, y40Var, hl0Var, a21Var, false, 64, null);
    }
}
