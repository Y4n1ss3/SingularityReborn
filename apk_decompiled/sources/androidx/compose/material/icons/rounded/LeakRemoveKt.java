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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LeakRemoveKt {
    private static ImageVector _leakRemove;

    public static final ImageVector getLeakRemove(Icons.Rounded rounded) {
        ImageVector imageVector = _leakRemove;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LeakRemove", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.12f, 12.04f);
        b.curveToRelative(0.5f, -0.05f, 0.88f, -0.48f, 0.88f, -0.99f);
        b.curveToRelative(0.0f, -0.59f, -0.51f, -1.06f, -1.1f, -1.0f);
        b.curveToRelative(-1.5f, 0.15f, -2.9f, 0.61f, -4.16f, 1.3f);
        b.lineToRelative(1.48f, 1.48f);
        b.curveToRelative(0.9f, -0.41f, 1.87f, -0.69f, 2.9f, -0.79f);
        b.close();
        b.moveTo(21.0f, 15.09f);
        b.curveToRelative(0.0f, -0.61f, -0.54f, -1.09f, -1.14f, -1.0f);
        b.curveToRelative(-0.38f, 0.06f, -0.75f, 0.16f, -1.11f, 0.28f);
        b.lineToRelative(1.62f, 1.62f);
        b.curveToRelative(0.37f, -0.15f, 0.63f, -0.49f, 0.63f, -0.9f);
        b.close();
        b.moveTo(13.97f, 4.14f);
        b.curveToRelative(0.06f, -0.59f, -0.4f, -1.11f, -1.0f, -1.11f);
        b.curveToRelative(-0.5f, 0.0f, -0.94f, 0.37f, -0.99f, 0.87f);
        b.curveToRelative(-0.1f, 1.03f, -0.38f, 2.01f, -0.79f, 2.91f);
        b.lineToRelative(1.48f, 1.48f);
        b.curveToRelative(0.69f, -1.26f, 1.15f, -2.66f, 1.3f, -4.15f);
        b.close();
        b.moveTo(9.93f, 4.16f);
        b.curveToRelative(0.1f, -0.6f, -0.39f, -1.14f, -1.0f, -1.14f);
        b.curveToRelative(-0.41f, 0.0f, -0.75f, 0.26f, -0.9f, 0.62f);
        b.lineToRelative(1.62f, 1.62f);
        b.curveToRelative(0.13f, -0.35f, 0.22f, -0.72f, 0.28f, -1.1f);
        k4.r(b, 20.44f, 18.88f, 5.12f, 3.56f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(2.15f, 2.15f);
        b.curveToRelative(-0.59f, 0.41f, -1.26f, 0.7f, -1.99f, 0.82f);
        b.curveToRelative(-0.48f, 0.1f, -0.84f, 0.5f, -0.84f, 1.0f);
        b.curveToRelative(0.0f, 0.61f, 0.54f, 1.09f, 1.14f, 1.0f);
        b.curveToRelative(1.17f, -0.19f, 2.23f, -0.68f, 3.13f, -1.37f);
        b.lineTo(8.73f, 10.0f);
        b.curveToRelative(-1.34f, 1.1f, -3.0f, 1.82f, -4.81f, 1.99f);
        b.curveToRelative(-0.5f, 0.05f, -0.88f, 0.48f, -0.88f, 0.99f);
        b.curveToRelative(0.0f, 0.59f, 0.51f, 1.06f, 1.1f, 1.0f);
        b.curveToRelative(2.28f, -0.23f, 4.36f, -1.15f, 6.01f, -2.56f);
        b.lineToRelative(2.48f, 2.48f);
        b.curveToRelative(-1.4f, 1.65f, -2.33f, 3.72f, -2.56f, 6.0f);
        b.curveToRelative(-0.06f, 0.59f, 0.4f, 1.11f, 1.0f, 1.11f);
        b.curveToRelative(0.5f, 0.0f, 0.94f, -0.37f, 0.99f, -0.87f);
        b.curveToRelative(0.18f, -1.82f, 0.9f, -3.48f, 1.99f, -4.82f);
        b.lineToRelative(1.43f, 1.43f);
        b.curveToRelative(-0.69f, 0.9f, -1.18f, 1.96f, -1.37f, 3.13f);
        b.curveToRelative(-0.1f, 0.6f, 0.39f, 1.14f, 1.0f, 1.14f);
        b.curveToRelative(0.49f, 0.0f, 0.9f, -0.36f, 0.98f, -0.85f);
        b.curveToRelative(0.12f, -0.73f, 0.42f, -1.4f, 0.82f, -1.99f);
        b.lineToRelative(2.13f, 2.13f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.38f, -0.41f, 0.38f, -1.04f, -0.01f, -1.43f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _leakRemove = build;
        build.getClass();
        return build;
    }
}
