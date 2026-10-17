package androidx.compose.material.icons.rounded;

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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HouseSidingKt {
    private static ImageVector _houseSiding;

    public static final ImageVector getHouseSiding(Icons.Rounded rounded) {
        ImageVector imageVector = _houseSiding;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HouseSiding", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(19.0f, 12.0f, 1.7f);
        a.curveToRelative(0.46f, 0.0f, 0.68f, -0.57f, 0.33f, -0.87f);
        a.lineTo(12.67f, 3.6f);
        a.curveToRelative(-0.38f, -0.34f, -0.96f, -0.34f, -1.34f, 0.0f);
        a.lineToRelative(-8.36f, 7.53f);
        a.curveTo(2.63f, 11.43f, 2.84f, 12.0f, 3.3f, 12.0f);
        a.horizontalLineTo(5.0f);
        a.verticalLineToRelative(7.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.horizontalLineToRelative(0.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(a, -1.0f, 10.0f, 1.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.horizontalLineToRelative(0.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        k4.D(a, 12.0f, 7.21f, 10.0f, 9.58f);
        uf.u(a, 17.0f, 10.19f, 12.0f, 7.0f);
        kf0.t(a, -1.81f, 7.21f, 10.0f);
        a.moveTo(14.57f, 8.0f);
        a.horizontalLineTo(9.43f);
        r6.C(a, 12.0f, 5.69f, 14.57f, 8.0f);
        bv.y(a, 7.0f, 16.0f, -2.0f, 10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(a, 2.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _houseSiding = build;
        build.getClass();
        return build;
    }
}
