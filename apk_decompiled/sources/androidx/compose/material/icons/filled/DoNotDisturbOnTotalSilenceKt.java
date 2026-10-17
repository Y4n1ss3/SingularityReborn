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
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoNotDisturbOnTotalSilenceKt {
    private static ImageVector _doNotDisturbOnTotalSilence;

    public static final ImageVector getDoNotDisturbOnTotalSilence(Icons.Filled filled) {
        ImageVector imageVector = _doNotDisturbOnTotalSilence;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DoNotDisturbOnTotalSilence", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b.reflectiveCurveTo(16.41f, 20.0f, 12.0f, 20.0f);
        b.close();
        b.moveTo(12.0f, 6.0f);
        b.curveToRelative(-3.3f, 0.0f, -6.0f, 2.7f, -6.0f, 6.0f);
        b.reflectiveCurveToRelative(2.7f, 6.0f, 6.0f, 6.0f);
        b.reflectiveCurveToRelative(6.0f, -2.7f, 6.0f, -6.0f);
        b.reflectiveCurveTo(15.4f, 6.0f, 12.0f, 6.0f);
        uo.q(b, 15.0f, 13.0f, 9.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(b, 6.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotDisturbOnTotalSilence = build;
        build.getClass();
        return build;
    }
}
