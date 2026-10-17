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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LeakAddKt {
    private static ImageVector _leakAdd;

    public static final ImageVector getLeakAdd(Icons.Rounded rounded) {
        ImageVector imageVector = _leakAdd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LeakAdd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.05f, 21.0f);
        b.curveToRelative(0.5f, 0.0f, 0.94f, -0.37f, 0.99f, -0.87f);
        b.curveToRelative(0.41f, -4.27f, 3.81f, -7.67f, 8.08f, -8.08f);
        b.curveToRelative(0.5f, -0.05f, 0.88f, -0.48f, 0.88f, -0.99f);
        b.curveToRelative(0.0f, -0.59f, -0.51f, -1.06f, -1.1f, -1.0f);
        b.curveToRelative(-5.19f, 0.52f, -9.32f, 4.65f, -9.84f, 9.83f);
        b.curveToRelative(-0.06f, 0.59f, 0.4f, 1.11f, 0.99f, 1.11f);
        r6.B(b, 18.0f, 21.0f, 3.0f, -3.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        b.close();
        b.moveTo(15.09f, 21.0f);
        b.curveToRelative(0.49f, 0.0f, 0.9f, -0.36f, 0.98f, -0.85f);
        b.curveToRelative(0.36f, -2.08f, 2.0f, -3.72f, 4.08f, -4.08f);
        b.curveToRelative(0.49f, -0.08f, 0.85f, -0.49f, 0.85f, -0.98f);
        b.curveToRelative(0.0f, -0.61f, -0.54f, -1.09f, -1.14f, -1.0f);
        b.curveToRelative(-2.96f, 0.48f, -5.29f, 2.81f, -5.77f, 5.77f);
        b.curveToRelative(-0.1f, 0.6f, 0.39f, 1.14f, 1.0f, 1.14f);
        b.close();
        b.moveTo(12.97f, 3.02f);
        b.curveToRelative(-0.5f, 0.0f, -0.94f, 0.37f, -0.99f, 0.87f);
        b.curveToRelative(-0.41f, 4.27f, -3.81f, 7.67f, -8.08f, 8.08f);
        b.curveToRelative(-0.5f, 0.05f, -0.88f, 0.48f, -0.88f, 0.99f);
        b.curveToRelative(0.0f, 0.59f, 0.51f, 1.06f, 1.1f, 1.0f);
        b.curveToRelative(5.19f, -0.52f, 9.32f, -4.65f, 9.84f, -9.83f);
        b.curveToRelative(0.07f, -0.58f, -0.39f, -1.11f, -0.99f, -1.11f);
        r6.B(b, 6.03f, 3.02f, -3.0f, 3.0f);
        b.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        b.close();
        b.moveTo(8.94f, 3.02f);
        b.curveToRelative(-0.49f, 0.0f, -0.9f, 0.36f, -0.98f, 0.85f);
        b.curveToRelative(-0.36f, 2.08f, -2.0f, 3.72f, -4.08f, 4.08f);
        b.curveToRelative(-0.49f, 0.09f, -0.85f, 0.49f, -0.85f, 0.99f);
        b.curveToRelative(0.0f, 0.61f, 0.54f, 1.09f, 1.14f, 1.0f);
        b.curveToRelative(2.96f, -0.48f, 5.29f, -2.81f, 5.77f, -5.77f);
        b.curveToRelative(0.09f, -0.61f, -0.4f, -1.15f, -1.0f, -1.15f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _leakAdd = build;
        build.getClass();
        return build;
    }
}
