package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NestedScrollInteropConnectionKt {
    private static final float ScrollingAxesThreshold = 0.5f;

    private static final float ceilAwayFromZero(float f) {
        return (float) (f >= 0.0f ? Math.ceil(f) : Math.floor(f));
    }

    public static final int composeToViewOffset(float f) {
        return extractIntegerPixels(f) * (-1);
    }

    private static final int extractIntegerPixels(float f) {
        return y80.P(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m6790getScrollAxesk4lQ0M(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5f ? i | 2 : i;
    }

    public static final NestedScrollConnection rememberNestedScrollInteropConnection(View view, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1075877987, i, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:278)");
        }
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        boolean changed = composer.changed(view) | composer.changed(viewConfiguration);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new NestedScrollInteropConnection(view, viewConfiguration.getMinimumFlingVelocity());
            composer.updateRememberedValue(rememberedValue);
        }
        NestedScrollInteropConnection nestedScrollInteropConnection = (NestedScrollInteropConnection) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return nestedScrollInteropConnection;
    }

    private static final float reverseAxis(int i) {
        return i * (-1.0f);
    }

    /* renamed from: scrollAxes-sF-c-tU, reason: not valid java name */
    private static final int m6791scrollAxessFctU(long j, float f) {
        int i = Math.abs(Velocity.m7849getXimpl(j)) >= f ? 1 : 0;
        return Math.abs(Velocity.m7850getYimpl(j)) >= f ? i | 2 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        if (r0 > r10) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (r9 > r10) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (r9 < r10) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r0 < r10) goto L14;
     */
    /* renamed from: toOffset-moWRBKg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m6792toOffsetmoWRBKg(int i, int i2, int[] iArr, long j) {
        float reverseAxis;
        float intBitsToFloat;
        float reverseAxis2;
        float intBitsToFloat2;
        float intBitsToFloat3 = Math.abs(iArr[0]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j >> 32)) - reverseAxis(i);
        float intBitsToFloat4 = Math.abs(iArr[1]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j & 4294967295L)) - reverseAxis(i2);
        int i3 = (int) (j >> 32);
        if (Float.intBitsToFloat(i3) >= 0.0f) {
            reverseAxis = reverseAxis(iArr[0]) + intBitsToFloat3;
            intBitsToFloat = Float.intBitsToFloat(i3);
        } else {
            reverseAxis = reverseAxis(iArr[0]) + intBitsToFloat3;
            intBitsToFloat = Float.intBitsToFloat(i3);
        }
        int i4 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i4) >= 0.0f) {
            reverseAxis2 = reverseAxis(iArr[1]) + intBitsToFloat4;
            intBitsToFloat2 = Float.intBitsToFloat(i4);
        } else {
            reverseAxis2 = reverseAxis(iArr[1]) + intBitsToFloat4;
            intBitsToFloat2 = Float.intBitsToFloat(i4);
        }
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(reverseAxis) << 32) | (Float.floatToRawIntBits(reverseAxis2) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toViewType-GyEprt8, reason: not valid java name */
    public static final int m6793toViewTypeGyEprt8(int i) {
        return !NestedScrollSource.m5957equalsimpl0(i, NestedScrollSource.Companion.m5969getUserInputWNlRxjI()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toViewVelocity(float f) {
        return f * (-1.0f);
    }
}
