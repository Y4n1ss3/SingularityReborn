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
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CloudQueueKt {
    private static ImageVector _cloudQueue;

    public static final ImageVector getCloudQueue(Icons.TwoTone twoTone) {
        ImageVector imageVector = _cloudQueue;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CloudQueue", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(19.0f, 12.0f, -1.5f, -0.5f);
        b.curveTo(17.5f, 8.46f, 15.04f, 6.0f, 12.0f, 6.0f);
        b.curveToRelative(-2.52f, 0.0f, -4.63f, 1.69f, -5.29f, 4.0f);
        b.horizontalLineTo(6.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        b.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b.horizontalLineToRelative(13.0f);
        b.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -1.34f, -3.0f, -3.0f, -3.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(19.35f, 10.04f);
        b2.curveTo(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        b2.curveTo(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
        b2.curveTo(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        b2.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        b2.horizontalLineToRelative(13.0f);
        b2.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        b2.curveToRelative(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        r6.g(b2, 19.0f, 18.0f, 6.0f);
        b2.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        b2.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        b2.horizontalLineToRelative(0.71f);
        b2.curveTo(7.37f, 7.69f, 9.48f, 6.0f, 12.0f, 6.0f);
        b2.curveToRelative(3.04f, 0.0f, 5.5f, 2.46f, 5.5f, 5.5f);
        b2.verticalLineToRelative(0.5f);
        b2.horizontalLineTo(19.0f);
        b2.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b2, -1.34f, 3.0f, -3.0f, 3.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cloudQueue = build;
        build.getClass();
        return build;
    }
}
