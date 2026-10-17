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
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideocamOffKt {
    private static ImageVector _videocamOff;

    public static final ImageVector getVideocamOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _videocamOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.VideocamOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.39f, 8.0f);
        pathBuilder.lineTo(15.0f, 10.61f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.close();
        bv.y(pathBuilder, 5.0f, 8.0f, 8.0f, 9.73f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(pathBuilder, -8.0f, -8.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(3.41f, 1.86f, 2.0f, 3.27f);
        i.lineTo(4.73f, 6.0f);
        i.lineTo(4.0f, 6.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(10.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(12.0f);
        i.curveToRelative(0.21f, 0.0f, 0.39f, -0.08f, 0.55f, -0.18f);
        i.lineTo(19.73f, 21.0f);
        gy.B(i, 1.41f, -1.41f, 3.41f, 1.86f);
        i.moveTo(5.0f, 16.0f);
        i.lineTo(5.0f, 8.0f);
        i.horizontalLineToRelative(1.73f);
        gy.B(i, 8.0f, 8.0f, 5.0f, 16.0f);
        i.moveTo(15.0f, 8.0f);
        i.verticalLineToRelative(2.61f);
        i.lineToRelative(6.0f, 6.0f);
        i.lineTo(21.0f, 6.5f);
        i.lineToRelative(-4.0f, 4.0f);
        i.lineTo(17.0f, 7.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.horizontalLineToRelative(-5.61f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 2.0f, 2.0f, 15.0f, 8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videocamOff = build;
        build.getClass();
        return build;
    }
}
