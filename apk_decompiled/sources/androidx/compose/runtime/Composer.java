package androidx.compose.runtime;

import androidx.compose.runtime.tooling.ComposeStackTraceMode;
import androidx.compose.runtime.tooling.CompositionData;
import defpackage.er;
import defpackage.iy;
import defpackage.kn;
import defpackage.my;
import defpackage.xe0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface Composer {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        public final Object getEmpty() {
            return Empty;
        }

        @er
        public final void setDiagnosticStackTraceEnabled(boolean z) {
            ComposeStackTraceMode.Companion companion = ComposeStackTraceMode.Companion;
            ComposerKt.m3837setComposeStackTraceMode76WK1J0(z ? companion.m4177getSourceInformationMD5MrJc() : companion.m4176getNoneMD5MrJc());
        }

        /* renamed from: setDiagnosticStackTraceMode-76WK1J0, reason: not valid java name */
        public final void m3836setDiagnosticStackTraceMode76WK1J0(int i) {
            ComposerKt.m3837setComposeStackTraceMode76WK1J0(i);
        }

        public final void setTracer(CompositionTracer compositionTracer) {
            ComposerKt.compositionTracer = compositionTracer;
        }
    }

    @ComposeCompilerApi
    <V, T> void apply(V v, my myVar);

    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(Object obj);

    @ComposeCompilerApi
    default boolean changed(boolean z) {
        return changed(z);
    }

    @ComposeCompilerApi
    default boolean changedInstance(Object obj) {
        return changed(obj);
    }

    void collectParameterInformation();

    <T> T consume(CompositionLocal<T> compositionLocal);

    @ComposeCompilerApi
    <T> void createNode(iy iyVar);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean z);

    @ComposeCompilerApi
    void disableReusing();

    void disableSourceInformation();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    void endProvider();

    void endProviders();

    @ComposeCompilerApi
    void endReplaceGroup();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @ComposeCompilerApi
    void endToMarker(int i);

    Applier<?> getApplier();

    kn getApplyCoroutineContext();

    long getCompositeKeyHashCode();

    ControlledComposition getComposition();

    CompositionData getCompositionData();

    default int getCompoundKeyHash() {
        return Long.hashCode(getCompositeKeyHashCode());
    }

    CompositionLocalMap getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    RecomposeScope getRecomposeScope();

    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    void insertMovableContent(MovableContent<?> movableContent, Object obj);

    void insertMovableContentReferences(List<xe0> list);

    @ComposeCompilerApi
    Object joinKey(Object obj, Object obj2);

    void recordSideEffect(iy iyVar);

    void recordUsed(RecomposeScope recomposeScope);

    @ComposeCompilerApi
    Object rememberedValue();

    CancellationHandle scheduleFrameEndCallback(iy iyVar);

    boolean shouldExecute(boolean z, int i);

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(String str);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int i, String str);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int i, Object obj);

    @ComposeCompilerApi
    void startNode();

    void startProvider(ProvidedValue<?> providedValue);

    void startProviders(ProvidedValue<?>[] providedValueArr);

    @ComposeCompilerApi
    void startReplaceGroup(int i);

    @ComposeCompilerApi
    void startReplaceableGroup(int i);

    @ComposeCompilerApi
    Composer startRestartGroup(int i);

    @ComposeCompilerApi
    void startReusableGroup(int i, Object obj);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(Object obj);

    @ComposeCompilerApi
    void useNode();

    @ComposeCompilerApi
    default boolean changed(char c) {
        return changed(c);
    }

    @ComposeCompilerApi
    default boolean changed(byte b) {
        return changed(b);
    }

    @ComposeCompilerApi
    default boolean changed(short s) {
        return changed(s);
    }

    @ComposeCompilerApi
    default boolean changed(int i) {
        return changed(i);
    }

    @ComposeCompilerApi
    default boolean changed(float f) {
        return changed(f);
    }

    @ComposeCompilerApi
    default boolean changed(long j) {
        return changed(j);
    }

    @ComposeCompilerApi
    default boolean changed(double d) {
        return changed(d);
    }

    @ComposeCompilerApi
    static /* synthetic */ void getApplier$annotations() {
    }

    static /* synthetic */ void getApplyCoroutineContext$annotations() {
    }

    static /* synthetic */ void getCompositeKeyHashCode$annotations() {
    }

    @er
    static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getCurrentMarker$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getInserting$annotations() {
    }

    static /* synthetic */ void getRecomposeScope$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getRecomposeScopeIdentity$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getSkipping$annotations() {
    }
}
