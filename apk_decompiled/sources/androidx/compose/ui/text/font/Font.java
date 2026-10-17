package androidx.compose.ui.text.font;

import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface Font {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long MaximumAsyncTimeoutMillis = 15000;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long MaximumAsyncTimeoutMillis = 15000;

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @er
    public interface ResourceLoader {
        @er
        Object load(Font font);
    }

    /* renamed from: getLoadingStrategy-PKNRLFQ */
    default int mo7117getLoadingStrategyPKNRLFQ() {
        return FontLoadingStrategy.Companion.m7164getBlockingPKNRLFQ();
    }

    /* renamed from: getStyle-_-LCdwA */
    int mo7125getStyle_LCdwA();

    FontWeight getWeight();
}
