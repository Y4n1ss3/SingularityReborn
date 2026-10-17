package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoNotStepKt {
    private static ImageVector _doNotStep;

    public static final ImageVector getDoNotStep(Icons.Sharp sharp) {
        ImageVector imageVector = _doNotStep;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DoNotStep", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(1.39f, 4.22f, 8.24f, 8.24f);
        e.lineToRelative(-0.69f, 0.72f);
        e.lineTo(6.87f, 11.1f);
        e.curveToRelative(-0.11f, 0.4f, -0.26f, 0.78f, -0.45f, 1.12f);
        e.lineToRelative(1.75f, 1.75f);
        e.lineToRelative(-0.69f, 0.72f);
        e.lineToRelative(-1.63f, -1.63f);
        e.curveToRelative(-0.24f, 0.29f, -0.5f, 0.56f, -0.77f, 0.8f);
        e.lineToRelative(1.63f, 1.63f);
        e.lineToRelative(-0.7f, 0.72f);
        e.lineToRelative(-1.74f, -1.74f);
        e.curveTo(2.83f, 15.43f, 1.34f, 15.82f, 1.0f, 15.92f);
        e.lineTo(1.0f, 20.0f);
        e.horizontalLineToRelative(9.5f);
        e.lineToRelative(3.33f, -3.33f);
        e.lineToRelative(5.94f, 5.94f);
        e.lineToRelative(1.41f, -1.41f);
        r6.C(e, 2.81f, 2.81f, 1.39f, 4.22f);
        e.moveTo(18.51f, 15.68f);
        e.lineToRelative(-1.41f, -1.41f);
        e.lineToRelative(4.48f, -4.48f);
        r6.C(e, 23.0f, 11.2f, 18.51f, 15.68f);
        e.moveTo(20.88f, 9.08f);
        e.lineToRelative(-4.48f, 4.48f);
        e.lineTo(9.3f, 6.47f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 13.8f, 2.0f, 20.88f, 9.08f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotStep = build;
        build.getClass();
        return build;
    }
}
