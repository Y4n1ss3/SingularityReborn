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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpeedKt {
    private static ImageVector _speed;

    public static final ImageVector getSpeed(Icons.Rounded rounded) {
        ImageVector imageVector = _speed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Speed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.46f, 10.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.07f, 1.0f);
        b.arcToRelative(7.55f, 7.55f, 0.0f, false, true, 0.52f, 1.81f);
        b.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.69f, 4.73f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.89f, 0.53f);
        b.horizontalLineTo(5.68f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.89f, -0.54f);
        b.arcTo(8.0f, 8.0f, 0.0f, false, true, 13.0f, 6.06f);
        b.arcToRelative(7.69f, 7.69f, 0.0f, false, true, 2.11f, 0.56f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -0.07f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.17f, -1.76f);
        b.arcTo(10.0f, 10.0f, 0.0f, false, false, 3.35f, 19.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.72f, 1.0f);
        b.horizontalLineToRelative(13.85f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.74f, -1.0f);
        b.arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.55f, -8.89f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.75f, -0.11f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(10.59f, 12.59f);
        b2.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.83f, 2.83f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b2, 5.66f, -8.49f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speed = build;
        build.getClass();
        return build;
    }
}
