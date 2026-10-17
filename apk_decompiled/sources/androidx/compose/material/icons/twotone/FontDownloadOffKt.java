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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FontDownloadOffKt {
    private static ImageVector _fontDownloadOff;

    public static final ImageVector getFontDownloadOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _fontDownloadOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FontDownloadOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(10.35f, 7.52f, 10.92f, 6.0f, 2.14f);
        k.lineToRelative(2.55f, 6.79f);
        uf.u(k, 20.0f, 17.17f, 4.0f, 6.83f);
        uo.l(k, 10.35f, 7.52f, 12.58f, 9.75f);
        k.lineToRelative(-0.54f, -1.52f);
        k.horizontalLineToRelative(-0.1f);
        gy.B(k, -0.23f, 0.66f, 12.58f, 9.75f);
        k.moveTo(17.17f, 20.0f);
        k.lineToRelative(-5.07f, -5.07f);
        bv.u(k, 9.58f, 8.49f, 18.0f, 6.41f);
        k.lineToRelative(2.39f, -6.37f);
        k.lineTo(4.0f, 6.83f);
        k.verticalLineTo(20.0f);
        k.horizontalLineTo(17.17f);
        k.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(4.83f, 2.0f, 20.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        k4.z(d, 15.17f, -2.0f, -2.0f, 4.0f);
        kf0.m(d, 6.83f, 4.83f, 2.0f);
        d.moveTo(10.92f, 6.0f);
        d.lineToRelative(-0.57f, 1.52f);
        d.lineToRelative(1.36f, 1.36f);
        d.lineToRelative(0.23f, -0.66f);
        d.horizontalLineToRelative(0.1f);
        d.lineToRelative(0.54f, 1.52f);
        d.lineToRelative(3.04f, 3.04f);
        kf0.h(d, 13.07f, 6.0f, 10.92f);
        d.moveTo(20.49f, 23.31f);
        d.lineTo(19.17f, 22.0f);
        d.horizontalLineTo(4.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.verticalLineTo(4.83f);
        d.lineTo(0.69f, 3.51f);
        d.lineTo(2.1f, 2.1f);
        gy.B(d, 19.8f, 19.8f, 20.49f, 23.31f);
        d.moveTo(17.17f, 20.0f);
        d.lineToRelative(-5.07f, -5.07f);
        bv.u(d, 9.58f, 8.49f, 18.0f, 6.41f);
        d.lineToRelative(2.39f, -6.37f);
        d.lineTo(4.0f, 6.83f);
        d.verticalLineTo(20.0f);
        d.horizontalLineTo(17.17f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fontDownloadOff = build;
        build.getClass();
        return build;
    }
}
