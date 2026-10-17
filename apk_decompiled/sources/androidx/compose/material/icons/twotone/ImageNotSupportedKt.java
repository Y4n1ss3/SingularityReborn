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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImageNotSupportedKt {
    private static ImageVector _imageNotSupported;

    public static final ImageVector getImageNotSupported(Icons.TwoTone twoTone) {
        ImageVector imageVector = _imageNotSupported;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ImageNotSupported", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(7.83f, 5.0f, 19.0f, 11.17f);
        uo.l(q, 7.83f, 5.0f, 16.17f, 19.0f);
        q.lineToRelative(-2.0f, -2.0f);
        q.horizontalLineTo(6.0f);
        q.lineToRelative(3.0f, -4.0f);
        q.lineToRelative(2.0f, 2.72f);
        q.lineToRelative(0.84f, -1.05f);
        q.lineTo(5.0f, 7.83f);
        q.verticalLineTo(19.0f);
        q.horizontalLineTo(16.17f);
        q.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, q.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(5.83f, 3.0f, 19.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        k4.z(d, 13.17f, -2.0f, -2.0f, 5.0f);
        kf0.m(d, 7.83f, 5.83f, 3.0f);
        d.moveTo(20.49f, 23.31f);
        d.lineTo(18.17f, 21.0f);
        d.horizontalLineTo(5.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.verticalLineTo(5.83f);
        d.lineTo(0.69f, 3.51f);
        d.lineTo(2.1f, 2.1f);
        d.lineToRelative(1.49f, 1.49f);
        d.lineTo(5.0f, 5.0f);
        d.lineToRelative(8.11f, 8.11f);
        d.lineToRelative(2.69f, 2.69f);
        d.lineTo(19.0f, 19.0f);
        d.lineToRelative(1.41f, 1.41f);
        gy.B(d, 1.49f, 1.49f, 20.49f, 23.31f);
        d.moveTo(16.17f, 19.0f);
        d.lineToRelative(-2.0f, -2.0f);
        d.horizontalLineTo(6.0f);
        d.lineToRelative(3.0f, -4.0f);
        d.lineToRelative(2.0f, 2.72f);
        d.lineToRelative(0.84f, -1.05f);
        d.lineTo(5.0f, 7.83f);
        d.verticalLineTo(19.0f);
        d.horizontalLineTo(16.17f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _imageNotSupported = build;
        build.getClass();
        return build;
    }
}
