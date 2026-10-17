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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BalanceKt {
    private static ImageVector _balance;

    public static final ImageVector getBalance(Icons.TwoTone twoTone) {
        ImageVector imageVector = _balance;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Balance", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 5.0f, -1.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(13.0f, 7.83f);
        b2.curveToRelative(0.85f, -0.3f, 1.53f, -0.98f, 1.83f, -1.83f);
        b2.horizontalLineTo(18.0f);
        b2.lineToRelative(-3.0f, 7.0f);
        b2.curveToRelative(0.0f, 1.66f, 1.57f, 3.0f, 3.5f, 3.0f);
        b2.reflectiveCurveToRelative(3.5f, -1.34f, 3.5f, -3.0f);
        fc.r(b2, -3.0f, -7.0f, 2.0f, 4.0f);
        b2.horizontalLineToRelative(-6.17f);
        b2.curveTo(14.42f, 2.83f, 13.31f, 2.0f, 12.0f, 2.0f);
        b2.reflectiveCurveTo(9.58f, 2.83f, 9.17f, 4.0f);
        af0.m(b2, 3.0f, 4.0f, 2.0f, 2.0f);
        b2.lineToRelative(-3.0f, 7.0f);
        b2.curveToRelative(0.0f, 1.66f, 1.57f, 3.0f, 3.5f, 3.0f);
        b2.reflectiveCurveTo(9.0f, 14.66f, 9.0f, 13.0f);
        b2.lineTo(6.0f, 6.0f);
        b2.horizontalLineToRelative(3.17f);
        b2.curveToRelative(0.3f, 0.85f, 0.98f, 1.53f, 1.83f, 1.83f);
        bv.A(b2, 19.0f, 2.0f, 2.0f, 20.0f);
        k4.p(b2, -2.0f, -9.0f, 7.83f);
        b2.moveTo(20.37f, 13.0f);
        b2.horizontalLineToRelative(-3.74f);
        gy.B(b2, 1.87f, -4.36f, 20.37f, 13.0f);
        b2.moveTo(7.37f, 13.0f);
        b2.horizontalLineTo(3.63f);
        r6.C(b2, 5.5f, 8.64f, 7.37f, 13.0f);
        b2.moveTo(12.0f, 6.0f);
        b2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b2.curveTo(13.0f, 5.55f, 12.55f, 6.0f, 12.0f, 6.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _balance = build;
        build.getClass();
        return build;
    }
}
