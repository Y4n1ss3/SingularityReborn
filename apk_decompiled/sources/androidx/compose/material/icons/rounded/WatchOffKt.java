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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WatchOffKt {
    private static ImageVector _watchOff;

    public static final ImageVector getWatchOff(Icons.Rounded rounded) {
        ImageVector imageVector = _watchOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WatchOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 7.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        b.curveToRelative(0.0f, 0.64f, -0.13f, 1.25f, -0.35f, 1.82f);
        b.lineToRelative(1.5f, 1.5f);
        b.curveTo(18.69f, 14.33f, 19.0f, 13.2f, 19.0f, 12.0f);
        b.curveToRelative(0.0f, -2.22f, -1.03f, -4.19f, -2.64f, -5.47f);
        b.lineToRelative(-0.93f, -3.1f);
        b.curveTo(15.17f, 2.58f, 14.4f, 2.0f, 13.51f, 2.0f);
        b.horizontalLineToRelative(-3.02f);
        b.curveTo(9.6f, 2.0f, 8.83f, 2.58f, 8.57f, 3.42f);
        b.lineTo(8.04f, 5.21f);
        b.lineToRelative(2.14f, 2.14f);
        b.curveTo(10.75f, 7.13f, 11.36f, 7.0f, 12.0f, 7.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.1f, 3.51f, 2.1f, 3.51f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(3.75f, 3.75f);
        i.curveTo(5.31f, 9.67f, 5.0f, 10.8f, 5.0f, 12.0f);
        i.curveToRelative(0.0f, 2.22f, 1.03f, 4.19f, 2.64f, 5.47f);
        i.lineToRelative(0.93f, 3.1f);
        i.curveTo(8.83f, 21.42f, 9.6f, 22.0f, 10.49f, 22.0f);
        i.horizontalLineToRelative(3.02f);
        i.curveToRelative(0.88f, 0.0f, 1.66f, -0.58f, 1.92f, -1.43f);
        i.lineToRelative(0.53f, -1.78f);
        i.lineToRelative(3.11f, 3.11f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        i.lineTo(3.51f, 3.51f);
        i.curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f);
        i.close();
        i.moveTo(12.0f, 17.0f);
        i.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        i.curveToRelative(0.0f, -0.64f, 0.13f, -1.25f, 0.35f, -1.82f);
        i.lineToRelative(6.47f, 6.47f);
        i.curveTo(13.25f, 16.87f, 12.64f, 17.0f, 12.0f, 17.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _watchOff = build;
        build.getClass();
        return build;
    }
}
