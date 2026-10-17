package androidx.compose.ui.layout;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class WindowWindowInsetsAnimationValues implements PlatformWindowInsetsAnimation {
    public static final int $stable = 8;
    private final RectRulers source;
    private final RectRulers target;
    private final MutableState isVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    private final MutableState isAnimating$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private final MutableFloatState fraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    private final MutableLongState durationMillis$delegate = SnapshotLongStateKt.mutableLongStateOf(0);
    private final MutableFloatState alpha$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
    private long current = ValueInsets_androidKt.getUnsetValueInsets();
    private long maximum = ValueInsets_androidKt.getUnsetValueInsets();
    private long sourceValueInsets = ValueInsets_androidKt.getUnsetValueInsets();
    private long targetValueInsets = ValueInsets_androidKt.getUnsetValueInsets();

    public WindowWindowInsetsAnimationValues(String str) {
        this.source = RectRulersKt.RectRulers(str + " source");
        this.target = RectRulersKt.RectRulers(str + " target");
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public float getAlpha() {
        return this.alpha$delegate.getFloatValue();
    }

    /* renamed from: getCurrent-hdzbrEE, reason: not valid java name */
    public final long m6383getCurrenthdzbrEE() {
        return this.current;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public long getDurationMillis() {
        return this.durationMillis$delegate.getLongValue();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public float getFraction() {
        return this.fraction$delegate.getFloatValue();
    }

    /* renamed from: getMaximum-hdzbrEE, reason: not valid java name */
    public final long m6384getMaximumhdzbrEE() {
        return this.maximum;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public RectRulers getSource() {
        return this.source;
    }

    /* renamed from: getSourceValueInsets-hdzbrEE, reason: not valid java name */
    public final long m6385getSourceValueInsetshdzbrEE() {
        return this.sourceValueInsets;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public RectRulers getTarget() {
        return this.target;
    }

    /* renamed from: getTargetValueInsets-hdzbrEE, reason: not valid java name */
    public final long m6386getTargetValueInsetshdzbrEE() {
        return this.targetValueInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public boolean isAnimating() {
        return ((Boolean) this.isAnimating$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    public void setAlpha(float f) {
        this.alpha$delegate.setFloatValue(f);
    }

    public void setAnimating(boolean z) {
        this.isAnimating$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: setCurrent-Ynlvx88, reason: not valid java name */
    public final void m6387setCurrentYnlvx88(long j) {
        this.current = j;
    }

    public void setDurationMillis(long j) {
        this.durationMillis$delegate.setLongValue(j);
    }

    public void setFraction(float f) {
        this.fraction$delegate.setFloatValue(f);
    }

    /* renamed from: setMaximum-Ynlvx88, reason: not valid java name */
    public final void m6388setMaximumYnlvx88(long j) {
        this.maximum = j;
    }

    /* renamed from: setSourceValueInsets-Ynlvx88, reason: not valid java name */
    public final void m6389setSourceValueInsetsYnlvx88(long j) {
        this.sourceValueInsets = j;
    }

    /* renamed from: setTargetValueInsets-Ynlvx88, reason: not valid java name */
    public final void m6390setTargetValueInsetsYnlvx88(long j) {
        this.targetValueInsets = j;
    }

    public void setVisible(boolean z) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z));
    }
}
