package androidx.compose.material.icons.filled;

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
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextRotationAngleupKt {
    private static ImageVector _textRotationAngleup;

    public static final ImageVector getTextRotationAngleup(Icons.Filled filled) {
        ImageVector imageVector = _textRotationAngleup;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TextRotationAngleup", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(4.49f, 4.21f, 3.43f, 5.27f);
        i.lineTo(7.85f, 16.4f);
        i.lineToRelative(1.48f, -1.48f);
        i.lineToRelative(-0.92f, -2.19f);
        i.lineToRelative(3.54f, -3.54f);
        i.lineToRelative(2.19f, 0.92f);
        gy.B(i, 1.48f, -1.48f, 4.49f, 4.21f);
        i.moveTo(7.58f, 11.01f);
        i.lineTo(5.36f, 6.14f);
        fc.C(i, 4.87f, 2.23f, -2.65f, 2.64f);
        i.moveTo(20.57f, 9.33f);
        i.horizontalLineToRelative(-4.24f);
        i.lineToRelative(1.41f, 1.41f);
        i.lineToRelative(-8.84f, 8.84f);
        i.lineTo(10.32f, 21.0f);
        i.lineToRelative(8.84f, -8.84f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 1.41f, 1.41f, 20.57f, 9.33f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationAngleup = build;
        build.getClass();
        return build;
    }
}
