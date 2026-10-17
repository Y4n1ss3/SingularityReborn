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
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TapAndPlayKt {
    private static ImageVector _tapAndPlay;

    public static final ImageVector getTapAndPlay(Icons.Rounded rounded) {
        ImageVector imageVector = _tapAndPlay;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TapAndPlay", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.14f, 16.09f);
        b.curveToRelative(-0.6f, -0.1f, -1.14f, 0.39f, -1.14f, 1.0f);
        b.curveToRelative(0.0f, 0.49f, 0.36f, 0.9f, 0.85f, 0.98f);
        b.curveToRelative(2.08f, 0.36f, 3.72f, 2.0f, 4.08f, 4.08f);
        b.curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f);
        b.curveToRelative(0.61f, 0.0f, 1.09f, -0.54f, 1.0f, -1.14f);
        b.curveToRelative(-0.48f, -2.95f, -2.81f, -5.29f, -5.77f, -5.77f);
        uo.C(b, 2.0f, 20.0f, 3.0f, 3.0f);
        b.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        b.close();
        b.moveTo(3.11f, 12.06f);
        b.curveToRelative(-0.59f, -0.06f, -1.11f, 0.4f, -1.11f, 0.99f);
        b.curveToRelative(0.0f, 0.5f, 0.37f, 0.94f, 0.87f, 0.99f);
        b.curveToRelative(4.27f, 0.41f, 7.67f, 3.81f, 8.08f, 8.08f);
        b.curveToRelative(0.05f, 0.5f, 0.48f, 0.88f, 0.99f, 0.88f);
        b.curveToRelative(0.59f, 0.0f, 1.06f, -0.51f, 1.0f, -1.1f);
        b.curveToRelative(-0.51f, -5.2f, -4.63f, -9.32f, -9.83f, -9.84f);
        k4.r(b, 17.0f, 1.01f, 7.0f, 1.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(7.37f);
        b.curveToRelative(0.69f, 0.16f, 1.36f, 0.37f, 2.0f, 0.64f);
        fc.w(b, 7.0f, 5.0f, 10.0f, 13.0f);
        b.horizontalLineToRelative(-3.03f);
        b.curveToRelative(0.52f, 1.25f, 0.84f, 2.59f, 0.95f, 4.0f);
        b.lineTo(17.0f, 22.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.lineTo(19.0f, 3.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tapAndPlay = build;
        build.getClass();
        return build;
    }
}
