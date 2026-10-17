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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlashOffKt {
    private static ImageVector _flashOff;

    public static final ImageVector getFlashOff(Icons.Rounded rounded) {
        ImageVector imageVector = _flashOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FlashOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.12f, 11.5f);
        b.curveToRelative(0.39f, -0.67f, -0.09f, -1.5f, -0.86f, -1.5f);
        b.horizontalLineToRelative(-1.87f);
        fc.C(b, 2.28f, 2.28f, 0.45f, -0.78f);
        b.moveTo(16.28f, 3.45f);
        b.curveToRelative(0.33f, -0.67f, -0.15f, -1.45f, -0.9f, -1.45f);
        b.lineTo(8.0f, 2.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(0.61f);
        fc.C(b, 6.13f, 6.13f, 3.15f, -6.29f);
        b.moveTo(18.44f, 17.88f);
        b.lineTo(4.12f, 3.56f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineTo(7.0f, 9.27f);
        b.lineTo(7.0f, 12.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(2.0f);
        b.verticalLineToRelative(7.15f);
        b.curveToRelative(0.0f, 0.51f, 0.67f, 0.69f, 0.93f, 0.25f);
        b.lineToRelative(2.65f, -4.55f);
        b.lineToRelative(3.44f, 3.44f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.4f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flashOff = build;
        build.getClass();
        return build;
    }
}
