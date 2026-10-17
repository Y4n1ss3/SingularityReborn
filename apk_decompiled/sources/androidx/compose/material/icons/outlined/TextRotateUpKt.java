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
import defpackage.fc;
import defpackage.j50;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextRotateUpKt {
    private static ImageVector _textRotateUp;

    public static final ImageVector getTextRotateUp(Icons.Outlined outlined) {
        ImageVector imageVector = _textRotateUp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TextRotateUp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(18.0f, 4.0f, -3.0f, 3.0f, 2.0f);
        uo.B(b, 13.0f, 2.0f, 19.0f, 7.0f);
        uo.w(b, 2.0f, -3.0f, -3.0f);
        b.moveTo(11.8f, 15.5f);
        b.verticalLineToRelative(-5.0f);
        b.lineToRelative(2.2f, -0.9f);
        b.lineTo(14.0f, 7.5f);
        b.lineTo(3.0f, 12.25f);
        j50.A(b, 1.5f, 11.0f, 4.75f, -2.1f);
        fc.B(b, -2.2f, -0.9f, 4.98f, 13.0f);
        b.lineTo(10.0f, 11.13f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(b, 3.74f, 4.98f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotateUp = build;
        build.getClass();
        return build;
    }
}
