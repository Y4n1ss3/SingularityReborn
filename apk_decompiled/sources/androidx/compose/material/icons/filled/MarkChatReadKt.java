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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarkChatReadKt {
    private static ImageVector _markChatRead;

    public static final ImageVector getMarkChatRead(Icons.Filled filled) {
        ImageVector imageVector = _markChatRead;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MarkChatRead", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.34f, 20.0f, -3.54f, -3.54f);
        e.lineToRelative(1.41f, -1.41f);
        e.lineToRelative(2.12f, 2.12f);
        e.lineToRelative(4.24f, -4.24f);
        r6.C(e, 23.0f, 14.34f, 17.34f, 20.0f);
        e.moveTo(12.0f, 17.0f);
        e.curveToRelative(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
        e.curveToRelative(1.08f, 0.0f, 2.09f, 0.25f, 3.0f, 0.68f);
        e.verticalLineTo(4.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineTo(4.0f);
        e.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        r6.h(e, 18.0f, 4.0f, -4.0f, 6.0f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, -0.17f, 0.01f, -0.33f, 0.03f, -0.5f);
        e.curveTo(12.01f, 17.34f, 12.0f, 17.17f, 12.0f, 17.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markChatRead = build;
        build.getClass();
        return build;
    }
}
