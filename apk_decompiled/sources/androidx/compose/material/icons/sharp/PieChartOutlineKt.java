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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PieChartOutlineKt {
    private static ImageVector _pieChartOutline;

    public static final ImageVector getPieChartOutline(Icons.Sharp sharp) {
        ImageVector imageVector = _pieChartOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PieChartOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(13.0f, 4.07f);
        b.curveToRelative(3.61f, 0.45f, 6.48f, 3.33f, 6.93f, 6.93f);
        r6.C(b, 13.0f, 11.0f, 13.0f, 4.07f);
        b.moveTo(4.0f, 12.0f);
        b.curveToRelative(0.0f, -4.06f, 3.07f, -7.44f, 7.0f, -7.93f);
        b.verticalLineToRelative(15.87f);
        b.curveToRelative(-3.93f, -0.5f, -7.0f, -3.88f, -7.0f, -7.94f);
        k4.r(b, 13.0f, 19.93f, 13.0f, 13.0f);
        b.horizontalLineToRelative(6.93f);
        b.curveToRelative(-0.45f, 3.61f, -3.32f, 6.48f, -6.93f, 6.93f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pieChartOutline = build;
        build.getClass();
        return build;
    }
}
