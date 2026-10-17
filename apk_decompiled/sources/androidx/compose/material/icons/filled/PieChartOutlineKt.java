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
import defpackage.bv;
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PieChartOutlineKt {
    private static ImageVector _pieChartOutline;

    public static final ImageVector getPieChartOutline(Icons.Filled filled) {
        ImageVector imageVector = _pieChartOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PieChartOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        bv.s(b, 13.0f, 4.07f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, -4.06f, 3.07f, -7.44f, 7.0f, -7.93f);
        b.verticalLineToRelative(15.87f);
        b.curveTo(7.07f, 19.44f, 4.0f, 16.06f, 4.0f, 12.0f);
        fc.A(b, 13.0f, 19.93f, 13.0f, 6.93f);
        b.curveTo(19.48f, 16.61f, 16.61f, 19.48f, 13.0f, 19.93f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pieChartOutline = build;
        build.getClass();
        return build;
    }
}
