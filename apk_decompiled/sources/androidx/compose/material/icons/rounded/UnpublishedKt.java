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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UnpublishedKt {
    private static ImageVector _unpublished;

    public static final ImageVector getUnpublished(Icons.Rounded rounded) {
        ImageVector imageVector = _unpublished;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Unpublished", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.49f, 20.49f, 3.51f, 3.51f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(1.56f, 1.56f);
        i.curveToRelative(-1.25f, 1.88f, -1.88f, 4.21f, -1.59f, 6.7f);
        i.curveToRelative(0.53f, 4.54f, 4.21f, 8.22f, 8.74f, 8.74f);
        i.curveToRelative(2.49f, 0.29f, 4.81f, -0.34f, 6.7f, -1.59f);
        i.lineToRelative(1.56f, 1.56f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f);
        k4.x(i, 9.88f, 15.89f, -2.83f, -2.83f);
        i.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        i.lineToRelative(2.12f, 2.12f);
        i.lineToRelative(0.18f, -0.18f);
        i.lineToRelative(1.41f, 1.41f);
        i.lineToRelative(-0.88f, 0.88f);
        i.curveTo(10.9f, 16.28f, 10.27f, 16.28f, 9.88f, 15.89f);
        k4.x(i, 13.59f, 10.76f, -7.1f, -7.1f);
        i.curveToRelative(1.88f, -1.25f, 4.21f, -1.88f, 6.7f, -1.59f);
        i.curveToRelative(4.54f, 0.53f, 8.22f, 4.21f, 8.74f, 8.74f);
        i.curveToRelative(0.29f, 2.49f, -0.34f, 4.82f, -1.59f, 6.7f);
        i.lineToRelative(-5.34f, -5.34f);
        i.lineToRelative(1.94f, -1.94f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 13.59f, 10.76f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unpublished = build;
        build.getClass();
        return build;
    }
}
