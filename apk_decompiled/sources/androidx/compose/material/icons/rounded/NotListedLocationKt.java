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
import defpackage.er;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotListedLocationKt {
    private static ImageVector _notListedLocation;

    public static final ImageVector getNotListedLocation(Icons.Rounded rounded) {
        ImageVector imageVector = _notListedLocation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NotListedLocation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f);
        b.curveToRelative(0.0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.22f);
        b.curveToRelative(0.38f, 0.33f, 0.95f, 0.33f, 1.33f, 0.0f);
        b.curveTo(17.55f, 17.12f, 20.0f, 13.38f, 20.0f, 10.2f);
        b.curveTo(20.0f, 5.22f, 16.2f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.01f, 16.0f);
        b.curveToRelative(-0.59f, 0.0f, -1.05f, -0.47f, -1.05f, -1.05f);
        b.curveToRelative(0.0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f);
        b.curveToRelative(0.59f, 0.0f, 1.04f, 0.45f, 1.04f, 1.04f);
        b.curveTo(13.05f, 15.53f, 12.61f, 16.0f, 12.01f, 16.0f);
        b.close();
        b.moveTo(14.52f, 9.83f);
        b.curveToRelative(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f);
        b.curveToRelative(-0.08f, 0.14f, -0.13f, 0.26f, -0.16f, 0.49f);
        b.curveToRelative(-0.05f, 0.39f, -0.36f, 0.68f, -0.75f, 0.68f);
        b.horizontalLineToRelative(-0.03f);
        b.curveToRelative(-0.44f, 0.0f, -0.79f, -0.38f, -0.75f, -0.82f);
        b.curveToRelative(0.03f, -0.27f, 0.09f, -0.57f, 0.25f, -0.84f);
        b.curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f);
        b.curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f);
        b.curveToRelative(-0.61f, 0.0f, -1.01f, 0.32f, -1.26f, 0.7f);
        b.curveToRelative(-0.19f, 0.29f, -0.57f, 0.39f, -0.89f, 0.25f);
        b.curveToRelative(-0.42f, -0.18f, -0.6f, -0.7f, -0.34f, -1.07f);
        b.curveTo(10.03f, 6.55f, 10.88f, 6.0f, 12.0f, 6.0f);
        b.curveToRelative(1.23f, 0.0f, 2.08f, 0.56f, 2.51f, 1.26f);
        b.curveTo(14.87f, 7.87f, 15.09f, 8.99f, 14.52f, 9.83f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notListedLocation = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getNotListedLocation$annotations(Icons.Rounded rounded) {
    }
}
