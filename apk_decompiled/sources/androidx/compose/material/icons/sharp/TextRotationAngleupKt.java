package androidx.compose.material.icons.sharp;

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
public final class TextRotationAngleupKt {
    private static ImageVector _textRotationAngleup;

    public static final ImageVector getTextRotationAngleup(Icons.Sharp sharp) {
        ImageVector imageVector = _textRotationAngleup;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TextRotationAngleup", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.76f, 9.0f, 1.41f, 1.41f);
        e.lineToRelative(-9.19f, 9.19f);
        e.lineToRelative(1.41f, 1.41f);
        e.lineToRelative(9.19f, -9.19f);
        e.lineTo(21.0f, 13.24f);
        uf.j(e, 21.0f, 9.0f, -4.24f);
        e.moveTo(8.48f, 12.75f);
        e.lineToRelative(3.54f, -3.54f);
        e.lineToRelative(2.19f, 0.92f);
        e.lineToRelative(1.48f, -1.48f);
        e.lineTo(4.56f, 4.23f);
        e.lineTo(3.5f, 5.29f);
        e.lineToRelative(4.42f, 11.14f);
        fc.C(e, 1.48f, -1.48f, -0.92f, -2.2f);
        e.moveTo(7.66f, 11.03f);
        e.lineTo(5.43f, 6.16f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 4.87f, 2.23f, -2.64f, 2.64f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationAngleup = build;
        build.getClass();
        return build;
    }
}
