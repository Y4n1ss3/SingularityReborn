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
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DescriptionKt {
    private static ImageVector _description;

    public static final ImageVector getDescription(Icons.TwoTone twoTone) {
        ImageVector imageVector = _description;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Description", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(13.0f, 4.0f, 6.0f, 4.0f, 16.0f);
        uo.n(s, 12.0f, 18.0f, 9.0f, -5.0f);
        uo.l(s, 13.0f, 4.0f, 16.0f, 18.0f);
        af0.m(s, 8.0f, 18.0f, -2.0f, 8.0f);
        kp0.z(s, 2.0f, 16.0f, 12.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.w(s, 8.0f, 14.0f, -2.0f, 8.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(8.0f, 16.0f, 8.0f, 2.0f);
        uo.l(b, 8.0f, 18.0f, 8.0f, 12.0f);
        j50.o(b, 8.0f, 2.0f, 8.0f, 14.0f);
        b.moveTo(14.0f, 2.0f);
        b.lineTo(6.0f, 2.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(16.0f);
        b.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        b.lineTo(18.0f, 22.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bv.o(b, 20.0f, 8.0f, -6.0f, -6.0f);
        b.moveTo(18.0f, 20.0f);
        b.lineTo(6.0f, 20.0f);
        fc.w(b, 6.0f, 4.0f, 7.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(b, 5.0f, 11.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _description = build;
        build.getClass();
        return build;
    }
}
