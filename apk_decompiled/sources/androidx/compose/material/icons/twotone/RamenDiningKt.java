package androidx.compose.material.icons.twotone;

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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RamenDiningKt {
    private static ImageVector _ramenDining;

    public static final ImageVector getRamenDining(Icons.TwoTone twoTone) {
        ImageVector imageVector = _ramenDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RamenDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(8.73f, 18.39f, 1.27f, 0.5f, 20.0f);
        bv.p(j, 4.0f, -1.11f, 1.27f, -0.5f);
        j.curveToRelative(2.16f, -0.85f, 3.74f, -2.47f, 4.4f, -4.39f);
        j.horizontalLineTo(4.34f);
        j.curveTo(4.99f, 15.92f, 6.58f, 17.54f, 8.73f, 18.39f);
        j.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder j2 = af0.j(22.0f, 3.51f, 2.0f, 4.0f, 3.99f);
        j2.verticalLineTo(12.0f);
        j2.horizontalLineTo(2.0f);
        j2.curveToRelative(0.0f, 3.69f, 2.47f, 6.86f, 6.0f, 8.25f);
        kf0.r(j2, 22.0f, 8.0f, -1.75f);
        j2.curveToRelative(3.53f, -1.39f, 6.0f, -4.56f, 6.0f, -8.25f);
        af0.y(j2, 10.5f, 8.0f, 22.0f, 6.5f);
        j2.horizontalLineTo(10.5f);
        j2.verticalLineTo(4.78f);
        j2.lineTo(22.0f, 3.51f);
        j2.close();
        j2.moveTo(8.0f, 5.06f);
        uo.x(j2, 1.0f, -0.11f, 6.5f, 8.0f);
        k4.D(j2, 5.06f, 8.0f, 8.0f, 1.0f);
        gy.s(j2, 4.0f, 8.0f, 8.0f);
        j2.moveTo(5.5f, 5.34f);
        fc.u(j2, 1.0f, -0.11f, 6.5f, -1.0f);
        k4.D(j2, 5.34f, 5.5f, 8.0f, 1.0f);
        k4.p(j2, 4.0f, -1.0f, 8.0f);
        j2.moveTo(19.66f, 14.0f);
        j2.curveToRelative(-0.66f, 1.92f, -2.24f, 3.54f, -4.4f, 4.39f);
        fc.t(j2, 14.0f, 18.89f, 20.0f, -4.0f);
        j2.verticalLineToRelative(-1.11f);
        j2.lineToRelative(-1.27f, -0.5f);
        j2.curveToRelative(-2.16f, -0.85f, -3.74f, -2.47f, -4.4f, -4.39f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(j2, 19.66f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ramenDining = build;
        build.getClass();
        return build;
    }
}
