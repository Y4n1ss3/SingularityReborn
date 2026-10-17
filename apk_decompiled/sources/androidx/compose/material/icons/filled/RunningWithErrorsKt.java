package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RunningWithErrorsKt {
    private static ImageVector _runningWithErrors;

    public static final ImageVector getRunningWithErrors(Icons.Filled filled) {
        ImageVector imageVector = _runningWithErrors;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RunningWithErrors", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(22.0f, 10.0f, 8.0f, -2.0f, -8.0f);
        kp0.D(s, 22.0f, 20.0f, 20.0f, 2.0f);
        kp0.j(s, 2.0f, -2.0f, 20.0f);
        s.moveTo(18.0f, 17.29f);
        s.curveTo(16.53f, 18.95f, 14.39f, 20.0f, 12.0f, 20.0f);
        s.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        s.curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
        s.verticalLineToRelative(9.0f);
        s.lineToRelative(7.55f, -7.55f);
        s.curveTo(17.72f, 3.34f, 15.02f, 2.0f, 12.0f, 2.0f);
        s.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        s.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        s.curveToRelative(2.25f, 0.0f, 4.33f, -0.74f, 6.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(s, 17.29f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _runningWithErrors = build;
        build.getClass();
        return build;
    }
}
