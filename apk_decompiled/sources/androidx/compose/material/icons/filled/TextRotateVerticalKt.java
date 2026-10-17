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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextRotateVerticalKt {
    private static ImageVector _textRotateVertical;

    public static final ImageVector getTextRotateVertical(Icons.Filled filled) {
        ImageVector imageVector = _textRotateVertical;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TextRotateVertical", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(15.75f, 5.0f, -1.5f, 9.5f, 16.0f);
        kf0.B(p, 2.1f, 0.9f, -2.2f, 5.0f);
        p.lineToRelative(0.9f, 2.2f);
        gy.n(p, 2.1f, 15.75f, 5.0f);
        p.moveTo(13.13f, 12.0f);
        p.lineTo(15.0f, 6.98f);
        uf.j(p, 16.87f, 12.0f, -3.74f);
        p.moveTo(6.0f, 19.75f);
        p.lineToRelative(3.0f, -3.0f);
        p.lineTo(7.0f, 16.75f);
        p.lineTo(7.0f, 4.25f);
        p.lineTo(5.0f, 4.25f);
        p.verticalLineToRelative(12.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(p, 3.0f, 16.75f, 3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotateVertical = build;
        build.getClass();
        return build;
    }
}
