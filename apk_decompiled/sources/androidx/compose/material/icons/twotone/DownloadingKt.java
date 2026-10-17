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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DownloadingKt {
    private static ImageVector _downloading;

    public static final ImageVector getDownloading(Icons.TwoTone twoTone) {
        ImageVector imageVector = _downloading;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Downloading", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.32f, 4.26f);
        b.curveTo(16.84f, 3.05f, 15.01f, 2.25f, 13.0f, 2.05f);
        b.verticalLineToRelative(2.02f);
        b.curveToRelative(1.46f, 0.18f, 2.79f, 0.76f, 3.9f, 1.62f);
        uo.l(b, 18.32f, 4.26f, 19.93f, 11.0f);
        b.horizontalLineToRelative(2.02f);
        b.curveToRelative(-0.2f, -2.01f, -1.0f, -3.84f, -2.21f, -5.32f);
        b.lineTo(18.31f, 7.1f);
        b.curveTo(19.17f, 8.21f, 19.75f, 9.54f, 19.93f, 11.0f);
        k4.x(b, 18.31f, 16.9f, 1.43f, 1.43f);
        b.curveToRelative(1.21f, -1.48f, 2.01f, -3.32f, 2.21f, -5.32f);
        b.horizontalLineToRelative(-2.02f);
        b.curveTo(19.75f, 14.46f, 19.17f, 15.79f, 18.31f, 16.9f);
        bv.v(b, 13.0f, 19.93f, 2.02f);
        b.curveToRelative(2.01f, -0.2f, 3.84f, -1.0f, 5.32f, -2.21f);
        b.lineToRelative(-1.43f, -1.43f);
        b.curveTo(15.79f, 19.17f, 14.46f, 19.75f, 13.0f, 19.93f);
        fc.A(b, 13.0f, 12.0f, 7.0f, -2.0f);
        fc.k(b, 5.0f, 7.0f, 5.0f, 5.0f);
        gy.w(b, 5.0f, -5.0f, 13.0f);
        b.moveTo(11.0f, 19.93f);
        b.verticalLineToRelative(2.02f);
        b.curveToRelative(-5.05f, -0.5f, -9.0f, -4.76f, -9.0f, -9.95f);
        b.reflectiveCurveToRelative(3.95f, -9.45f, 9.0f, -9.95f);
        b.verticalLineToRelative(2.02f);
        b.curveTo(7.05f, 4.56f, 4.0f, 7.92f, 4.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 7.05f, 19.44f, 11.0f, 19.93f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _downloading = build;
        build.getClass();
        return build;
    }
}
