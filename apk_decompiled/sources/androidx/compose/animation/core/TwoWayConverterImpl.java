package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TwoWayConverterImpl<T, V extends AnimationVector> implements TwoWayConverter<T, V> {
    private final ky convertFromVector;
    private final ky convertToVector;

    public TwoWayConverterImpl(ky kyVar, ky kyVar2) {
        this.convertToVector = kyVar;
        this.convertFromVector = kyVar2;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public ky getConvertFromVector() {
        return this.convertFromVector;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public ky getConvertToVector() {
        return this.convertToVector;
    }
}
