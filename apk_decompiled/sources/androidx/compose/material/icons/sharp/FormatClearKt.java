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
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatClearKt {
    private static ImageVector _formatClear;

    public static final ImageVector getFormatClear(Icons.Sharp sharp) {
        ImageVector imageVector = _formatClear;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FormatClear", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 8.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(6.39f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(1.83f);
        pathBuilder.lineToRelative(-0.55f, 1.28f);
        gy.B(pathBuilder, 2.09f, 2.1f, 14.21f, 8.0f);
        pathBuilder.moveTo(3.41f, 4.86f);
        pathBuilder.lineTo(2.0f, 6.27f);
        pathBuilder.lineToRelative(6.97f, 6.97f);
        pathBuilder.lineTo(6.5f, 19.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.lineToRelative(1.57f, -3.66f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(pathBuilder, 16.73f, 21.0f, 1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatClear = build;
        build.getClass();
        return build;
    }
}
