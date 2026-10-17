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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChurchKt {
    private static ImageVector _church;

    public static final ImageVector getChurch(Icons.Outlined outlined) {
        ImageVector imageVector = _church;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Church", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = bv.i(18.0f, 12.22f, 9.0f, -5.0f, -2.5f);
        gy.z(i, 5.0f, 2.0f, 3.0f, -2.0f);
        j50.B(i, 1.0f, -2.0f, 2.0f, 9.0f);
        kf0.z(i, 2.0f, 2.0f, 1.5f);
        i.lineTo(6.0f, 9.0f);
        bv.q(i, 3.22f, 2.0f, 14.0f, 8.0f);
        i.horizontalLineToRelative(9.0f);
        i.verticalLineToRelative(-4.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        kf0.z(i, 4.0f, 9.0f, -8.0f);
        uo.l(i, 18.0f, 12.22f, 20.0f, 20.0f);
        i.horizontalLineToRelative(-5.0f);
        i.verticalLineToRelative(-2.04f);
        i.curveToRelative(0.0f, -1.69f, -1.35f, -3.06f, -3.0f, -3.06f);
        i.curveToRelative(-1.65f, 0.0f, -3.0f, 1.37f, -3.0f, 3.06f);
        r6.v(i, 20.0f, 4.0f, -4.79f);
        i.lineToRelative(4.0f, -1.81f);
        i.verticalLineToRelative(-3.35f);
        i.lineTo(12.0f, 8.0f);
        i.lineToRelative(4.0f, 2.04f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.n(i, 3.35f, 4.0f, 1.81f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 12.0f, -1.5f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _church = build;
        build.getClass();
        return build;
    }
}
