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
import defpackage.fc;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RadioKt {
    private static ImageVector _radio;

    public static final ImageVector getRadio(Icons.Outlined outlined) {
        ImageVector imageVector = _radio;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Radio", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 6.0f, 8.3f, 6.0f);
        i.lineToRelative(8.26f, -3.34f);
        i.lineTo(15.88f, 1.0f);
        i.lineTo(3.24f, 6.15f);
        i.curveTo(2.51f, 6.43f, 2.0f, 7.17f, 2.0f, 8.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(22.0f, 8.0f);
        i.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        uo.C(i, 20.0f, 8.0f, 3.0f, -2.0f);
        fc.w(i, 18.0f, 9.0f, -2.0f, 2.0f);
        i.lineTo(4.0f, 11.0f);
        uf.j(i, 4.0f, 8.0f, 16.0f);
        bv.y(i, 4.0f, 20.0f, -7.0f, 16.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(i, 7.0f, 4.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(8.0f, 16.48f, -2.5f, 0.0f);
        b.arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f);
        b.arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _radio = build;
        build.getClass();
        return build;
    }
}
