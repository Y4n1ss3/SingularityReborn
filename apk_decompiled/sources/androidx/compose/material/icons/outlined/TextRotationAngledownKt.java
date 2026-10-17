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
import defpackage.bv;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextRotationAngledownKt {
    private static ImageVector _textRotationAngledown;

    public static final ImageVector getTextRotationAngledown(Icons.Outlined outlined) {
        ImageVector imageVector = _textRotationAngledown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TextRotationAngledown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(15.0f, 21.0f, -4.24f, -1.41f, 1.41f);
        n.lineToRelative(-9.2f, -9.19f);
        n.lineToRelative(-1.41f, 1.41f);
        n.lineToRelative(9.19f, 9.19f);
        r6.C(n, 10.76f, 21.0f, 15.0f, 21.0f);
        n.moveTo(11.25f, 8.48f);
        n.lineToRelative(3.54f, 3.54f);
        n.lineToRelative(-0.92f, 2.19f);
        n.lineToRelative(1.48f, 1.48f);
        n.lineToRelative(4.42f, -11.14f);
        n.lineToRelative(-1.06f, -1.05f);
        n.lineTo(7.57f, 7.92f);
        bv.o(n, 9.06f, 9.4f, 2.19f, -0.92f);
        n.moveTo(17.84f, 5.43f);
        n.lineToRelative(-2.23f, 4.87f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(n, -2.64f, -2.64f, 4.87f, -2.23f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationAngledown = build;
        build.getClass();
        return build;
    }
}
