package androidx.compose.material.icons.automirrored.twotone;

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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CommentKt {
    private static ImageVector _comment;

    public static final ImageVector getComment(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _comment;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.Comment", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 17.17f, 20.0f, 4.0f);
        af0.m(i, 4.0f, 4.0f, 12.0f, 14.83f);
        uo.l(i, 20.0f, 17.17f, 18.0f, 14.0f);
        af0.m(i, 6.0f, 14.0f, -2.0f, 12.0f);
        r6.l(i, 2.0f, 18.0f, 11.0f);
        i.lineTo(6.0f, 11.0f);
        r6.m(i, 6.0f, 9.0f, 12.0f, 2.0f);
        i.moveTo(18.0f, 8.0f);
        i.lineTo(6.0f, 8.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(i, 6.0f, 6.0f, 12.0f, 2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i2 = uo.i(4.0f, 18.0f, 14.0f, 4.0f, 4.0f);
        i2.lineToRelative(-0.01f, -18.0f);
        i2.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f);
        i2.lineTo(4.0f, 2.0f);
        i2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i2.verticalLineToRelative(12.0f);
        i2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        r6.B(i2, 4.0f, 4.0f, 16.0f, 13.17f);
        i2.lineTo(18.83f, 16.0f);
        r6.C(i2, 4.0f, 16.0f, 4.0f, 4.0f);
        k4.C(i2, 6.0f, 12.0f, 12.0f, 2.0f);
        uo.l(i2, 6.0f, 14.0f, 6.0f, 9.0f);
        j50.o(i2, 12.0f, 2.0f, 6.0f, 11.0f);
        k4.C(i2, 6.0f, 6.0f, 12.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i2, 6.0f, 8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _comment = build;
        build.getClass();
        return build;
    }
}
