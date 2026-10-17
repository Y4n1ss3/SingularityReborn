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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExploreOffKt {
    private static ImageVector _exploreOff;

    public static final ImageVector getExploreOff(Icons.Outlined outlined) {
        ImageVector imageVector = _exploreOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ExploreOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        b.curveToRelative(0.0f, 1.48f, -0.41f, 2.86f, -1.12f, 4.06f);
        b.lineToRelative(1.46f, 1.46f);
        b.curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f);
        b.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        b.curveToRelative(-2.04f, 0.0f, -3.93f, 0.61f, -5.51f, 1.66f);
        b.lineToRelative(1.46f, 1.46f);
        b.curveTo(9.14f, 4.41f, 10.52f, 4.0f, 12.0f, 4.0f);
        k4.r(b, 14.91f, 12.08f, 17.5f, 6.5f);
        fc.C(b, -5.58f, 2.59f, 2.99f, 2.99f);
        b.moveTo(2.1f, 4.93f);
        b.lineToRelative(1.56f, 1.56f);
        b.curveTo(2.61f, 8.07f, 2.0f, 9.96f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.curveToRelative(2.04f, 0.0f, 3.93f, -0.61f, 5.51f, -1.66f);
        b.lineToRelative(1.56f, 1.56f);
        b.lineToRelative(1.41f, -1.41f);
        r6.C(b, 3.51f, 3.51f, 2.1f, 4.93f);
        b.moveTo(5.12f, 7.94f);
        b.lineToRelative(3.98f, 3.98f);
        b.lineToRelative(-2.6f, 5.58f);
        b.lineToRelative(5.58f, -2.59f);
        b.lineToRelative(3.98f, 3.98f);
        b.curveToRelative(-1.2f, 0.7f, -2.58f, 1.11f, -4.06f, 1.11f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b.curveToRelative(0.0f, -1.48f, 0.41f, -2.86f, 1.12f, -4.06f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _exploreOff = build;
        build.getClass();
        return build;
    }
}
