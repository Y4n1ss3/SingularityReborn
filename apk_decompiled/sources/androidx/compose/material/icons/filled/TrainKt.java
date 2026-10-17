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
import defpackage.af0;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TrainKt {
    private static ImageVector _train;

    public static final ImageVector getTrain(Icons.Filled filled) {
        ImageVector imageVector = _train;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Train", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveToRelative(-4.0f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f);
        b.verticalLineToRelative(9.5f);
        b.curveTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f);
        af0.m(b, 6.0f, 20.5f, 0.5f, 2.23f);
        b.lineToRelative(2.0f, -2.0f);
        b.lineTo(14.0f, 19.0f);
        r6.q(b, 2.0f, 2.0f, 2.0f, -0.5f);
        b.lineTo(16.5f, 19.0f);
        b.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        b.lineTo(20.0f, 6.0f);
        b.curveToRelative(0.0f, -3.5f, -3.58f, -4.0f, -8.0f, -4.0f);
        b.close();
        b.moveTo(7.5f, 17.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveTo(6.67f, 14.0f, 7.5f, 14.0f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(8.33f, 17.0f, 7.5f, 17.0f);
        k4.r(b, 11.0f, 10.0f, 6.0f, 10.0f);
        r6.m(b, 6.0f, 6.0f, 5.0f, 4.0f);
        b.moveTo(13.0f, 10.0f);
        fc.w(b, 13.0f, 6.0f, 5.0f, 4.0f);
        j50.t(b, -5.0f, 16.5f, 17.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -0.67f, 1.5f, -1.5f, 1.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _train = build;
        build.getClass();
        return build;
    }
}
