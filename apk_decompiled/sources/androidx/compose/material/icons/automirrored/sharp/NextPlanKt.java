package androidx.compose.material.icons.automirrored.sharp;

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
import defpackage.j50;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NextPlanKt {
    private static ImageVector _nextPlan;

    public static final ImageVector getNextPlan(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _nextPlan;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.NextPlan", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        af0.l(b, 18.0f, 13.97f, -5.0f);
        b.lineToRelative(2.26f, -2.26f);
        b.curveToRelative(-0.91f, -1.06f, -2.25f, -1.74f, -3.76f, -1.74f);
        b.curveToRelative(-2.37f, 0.0f, -4.35f, 1.66f, -4.86f, 3.88f);
        b.lineToRelative(-0.96f, -0.32f);
        b.curveToRelative(0.64f, -2.62f, 3.0f, -4.56f, 5.82f, -4.56f);
        b.curveToRelative(1.78f, 0.0f, 3.37f, 0.79f, 4.47f, 2.03f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(b, 18.0f, 8.97f, 13.97f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nextPlan = build;
        build.getClass();
        return build;
    }
}
