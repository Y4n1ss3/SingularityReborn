package androidx.compose.material.icons.outlined;

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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BedroomParentKt {
    private static ImageVector _bedroomParent;

    public static final ImageVector getBedroomParent(Icons.Outlined outlined) {
        ImageVector imageVector = _bedroomParent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BedroomParent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(18.35f, 11.45f, 9.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineTo(13.0f);
        d.curveToRelative(-0.37f, 0.0f, -0.72f, 0.12f, -1.0f, 0.32f);
        d.curveTo(11.72f, 7.12f, 11.37f, 7.0f, 11.0f, 7.0f);
        d.horizontalLineTo(7.65f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        d.verticalLineToRelative(2.45f);
        d.curveTo(5.25f, 11.91f, 5.0f, 12.51f, 5.0f, 13.17f);
        uf.p(d, 17.0f, 1.5f, -1.5f, 11.0f);
        r6.v(d, 17.0f, 19.0f, -3.83f);
        d.curveTo(19.0f, 12.51f, 18.75f, 11.91f, 18.35f, 11.45f);
        r6.B(d, 16.75f, 10.5f, -4.0f, -2.0f);
        uo.r(d, 4.0f, 10.5f, 7.25f, 8.5f);
        bv.l(d, 4.0f, 2.0f, -4.0f, 8.5f);
        k4.C(d, 17.5f, 14.0f, -11.0f, -1.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(9.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        kf0.D(d, 14.0f, 20.0f, 4.0f, 16.0f);
        fc.q(d, 4.0f, 4.0f, 20.0f);
        d.moveTo(20.0f, 2.0f);
        d.horizontalLineTo(4.0f);
        d.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(4.0f);
        d.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bedroomParent = build;
        build.getClass();
        return build;
    }
}
