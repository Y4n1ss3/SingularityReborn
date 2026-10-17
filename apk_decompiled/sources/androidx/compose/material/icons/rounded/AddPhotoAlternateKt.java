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
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddPhotoAlternateKt {
    private static ImageVector _addPhotoAlternate;

    public static final ImageVector getAddPhotoAlternate(Icons.Rounded rounded) {
        ImageVector imageVector = _addPhotoAlternate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AddPhotoAlternate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(21.02f, 5.0f, 19.0f, 2.98f);
        c.curveToRelative(0.0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f);
        c.horizontalLineToRelative(-0.03f);
        c.curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.98f);
        c.verticalLineTo(5.0f);
        c.horizontalLineToRelative(-2.01f);
        c.curveToRelative(-0.54f, 0.0f, -0.98f, 0.44f, -0.99f, 0.98f);
        c.verticalLineToRelative(0.03f);
        c.curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f);
        c.horizontalLineTo(17.0f);
        c.verticalLineToRelative(2.01f);
        c.curveToRelative(0.0f, 0.54f, 0.44f, 0.99f, 0.99f, 0.98f);
        c.horizontalLineToRelative(0.03f);
        c.curveToRelative(0.54f, 0.0f, 0.98f, -0.44f, 0.98f, -0.98f);
        c.verticalLineTo(7.0f);
        c.horizontalLineToRelative(2.02f);
        c.curveToRelative(0.54f, 0.0f, 0.98f, -0.44f, 0.98f, -0.98f);
        c.verticalLineToRelative(-0.04f);
        c.curveToRelative(0.0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f);
        fc.A(c, 16.0f, 9.01f, 8.0f, -1.01f);
        c.curveToRelative(-0.53f, 0.0f, -1.03f, -0.21f, -1.41f, -0.58f);
        c.curveToRelative(-0.37f, -0.38f, -0.58f, -0.88f, -0.58f, -1.44f);
        c.curveToRelative(0.0f, -0.36f, 0.1f, -0.69f, 0.27f, -0.98f);
        c.horizontalLineTo(5.0f);
        c.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        c.verticalLineToRelative(12.0f);
        c.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c.horizontalLineToRelative(12.0f);
        c.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c.verticalLineToRelative(-8.28f);
        c.curveToRelative(-0.3f, 0.17f, -0.64f, 0.28f, -1.02f, 0.28f);
        c.curveToRelative(-1.09f, -0.01f, -1.98f, -0.9f, -1.98f, -1.99f);
        r6.g(c, 15.96f, 19.0f, 6.0f);
        c.curveToRelative(-0.41f, 0.0f, -0.65f, -0.47f, -0.4f, -0.8f);
        c.lineToRelative(1.98f, -2.63f);
        c.curveToRelative(0.21f, -0.28f, 0.62f, -0.26f, 0.82f, 0.02f);
        c.lineTo(10.0f, 18.0f);
        c.lineToRelative(2.61f, -3.48f);
        c.curveToRelative(0.2f, -0.26f, 0.59f, -0.27f, 0.79f, -0.01f);
        c.lineToRelative(2.95f, 3.68f);
        c.curveToRelative(0.26f, 0.33f, 0.03f, 0.81f, -0.39f, 0.81f);
        c.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addPhotoAlternate = build;
        build.getClass();
        return build;
    }
}
