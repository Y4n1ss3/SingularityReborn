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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UnpublishedKt {
    private static ImageVector _unpublished;

    public static final ImageVector getUnpublished(Icons.Outlined outlined) {
        ImageVector imageVector = _unpublished;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Unpublished", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.94f, 5.12f, 6.49f, 3.66f);
        i.curveTo(8.07f, 2.61f, 9.96f, 2.0f, 12.0f, 2.0f);
        i.curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f);
        i.curveToRelative(0.0f, 2.04f, -0.61f, 3.93f, -1.66f, 5.51f);
        i.lineToRelative(-1.46f, -1.46f);
        i.curveTo(19.59f, 14.86f, 20.0f, 13.48f, 20.0f, 12.0f);
        i.curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f);
        i.curveTo(10.52f, 4.0f, 9.14f, 4.41f, 7.94f, 5.12f);
        k4.x(i, 17.66f, 9.53f, -1.41f, -1.41f);
        i.lineToRelative(-2.65f, 2.65f);
        gy.B(i, 1.41f, 1.41f, 17.66f, 9.53f);
        i.moveTo(19.78f, 22.61f);
        i.lineToRelative(-2.27f, -2.27f);
        i.curveTo(15.93f, 21.39f, 14.04f, 22.0f, 12.0f, 22.0f);
        i.curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f);
        i.curveToRelative(0.0f, -2.04f, 0.61f, -3.93f, 1.66f, -5.51f);
        i.lineTo(1.39f, 4.22f);
        i.lineToRelative(1.41f, -1.41f);
        gy.B(i, 18.38f, 18.38f, 19.78f, 22.61f);
        i.moveTo(16.06f, 18.88f);
        i.lineToRelative(-3.88f, -3.88f);
        i.lineToRelative(-1.59f, 1.59f);
        i.lineToRelative(-4.24f, -4.24f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineToRelative(2.83f, 2.83f);
        i.lineToRelative(0.18f, -0.18f);
        i.lineTo(5.12f, 7.94f);
        i.curveTo(4.41f, 9.14f, 4.0f, 10.52f, 4.0f, 12.0f);
        i.curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f);
        i.curveTo(13.48f, 20.0f, 14.86f, 19.59f, 16.06f, 18.88f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unpublished = build;
        build.getClass();
        return build;
    }
}
