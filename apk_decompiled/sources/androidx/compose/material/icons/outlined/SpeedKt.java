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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpeedKt {
    private static ImageVector _speed;

    public static final ImageVector getSpeed(Icons.Outlined outlined) {
        ImageVector imageVector = _speed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Speed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.38f, 8.57f, -1.23f, 1.85f);
        e.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.22f, 7.58f);
        e.horizontalLineTo(5.07f);
        e.arcTo(8.0f, 8.0f, 0.0f, false, true, 15.58f, 6.85f);
        e.lineToRelative(1.85f, -1.23f);
        e.arcTo(10.0f, 10.0f, 0.0f, false, false, 3.35f, 19.0f);
        e.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.72f, 1.0f);
        e.horizontalLineToRelative(13.85f);
        e.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.74f, -1.0f);
        e.arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.27f, -10.44f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.59f, 15.41f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.83f, 0.0f);
        b.lineToRelative(5.66f, -8.49f);
        b.lineToRelative(-8.49f, 5.66f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.83f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speed = build;
        build.getClass();
        return build;
    }
}
