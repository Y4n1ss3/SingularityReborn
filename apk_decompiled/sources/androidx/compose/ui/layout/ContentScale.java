package androidx.compose.ui.layout;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ContentScale {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: computeScaleFactor-H7hwNQA, reason: not valid java name */
    long mo6227computeScaleFactorH7hwNQA(long j, long j2);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ContentScale Crop = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo6227computeScaleFactorH7hwNQA(long j, long j2) {
                float m6231computeFillMaxDimensioniLBOSCw;
                m6231computeFillMaxDimensioniLBOSCw = ContentScaleKt.m6231computeFillMaxDimensioniLBOSCw(j, j2);
                return ScaleFactor.m6347constructorimpl((Float.floatToRawIntBits(m6231computeFillMaxDimensioniLBOSCw) << 32) | (Float.floatToRawIntBits(m6231computeFillMaxDimensioniLBOSCw) & 4294967295L));
            }
        };
        private static final ContentScale Fit = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo6227computeScaleFactorH7hwNQA(long j, long j2) {
                float m6232computeFillMinDimensioniLBOSCw;
                m6232computeFillMinDimensioniLBOSCw = ContentScaleKt.m6232computeFillMinDimensioniLBOSCw(j, j2);
                return ScaleFactor.m6347constructorimpl((Float.floatToRawIntBits(m6232computeFillMinDimensioniLBOSCw) << 32) | (Float.floatToRawIntBits(m6232computeFillMinDimensioniLBOSCw) & 4294967295L));
            }
        };
        private static final ContentScale FillHeight = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo6227computeScaleFactorH7hwNQA(long j, long j2) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                return ScaleFactor.m6347constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
            }
        };
        private static final ContentScale FillWidth = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo6227computeScaleFactorH7hwNQA(long j, long j2) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                return ScaleFactor.m6347constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
            }
        };
        private static final ContentScale Inside = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo6227computeScaleFactorH7hwNQA(long j, long j2) {
                float m6232computeFillMinDimensioniLBOSCw;
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    return ScaleFactor.m6347constructorimpl((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
                }
                m6232computeFillMinDimensioniLBOSCw = ContentScaleKt.m6232computeFillMinDimensioniLBOSCw(j, j2);
                return ScaleFactor.m6347constructorimpl((Float.floatToRawIntBits(m6232computeFillMinDimensioniLBOSCw) << 32) | (Float.floatToRawIntBits(m6232computeFillMinDimensioniLBOSCw) & 4294967295L));
            }
        };
        private static final FixedScale None = new FixedScale(1.0f);
        private static final ContentScale FillBounds = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo6227computeScaleFactorH7hwNQA(long j, long j2) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                return ScaleFactor.m6347constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
            }
        };

        private Companion() {
        }

        public final ContentScale getCrop() {
            return Crop;
        }

        public final ContentScale getFillBounds() {
            return FillBounds;
        }

        public final ContentScale getFillHeight() {
            return FillHeight;
        }

        public final ContentScale getFillWidth() {
            return FillWidth;
        }

        public final ContentScale getFit() {
            return Fit;
        }

        public final ContentScale getInside() {
            return Inside;
        }

        public final FixedScale getNone() {
            return None;
        }

        public static /* synthetic */ void getCrop$annotations() {
        }

        public static /* synthetic */ void getFillBounds$annotations() {
        }

        public static /* synthetic */ void getFillHeight$annotations() {
        }

        public static /* synthetic */ void getFillWidth$annotations() {
        }

        public static /* synthetic */ void getFit$annotations() {
        }

        public static /* synthetic */ void getInside$annotations() {
        }

        public static /* synthetic */ void getNone$annotations() {
        }
    }
}
