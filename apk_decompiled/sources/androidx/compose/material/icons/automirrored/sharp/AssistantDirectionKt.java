package androidx.compose.material.icons.automirrored.sharp;

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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AssistantDirectionKt {
    private static ImageVector _assistantDirection;

    public static final ImageVector getAssistantDirection(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _assistantDirection;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.AssistantDirection", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(13.5f, 10.0f, 8.0f, 5.0f, 2.0f);
        kf0.z(i, -3.0f, 3.5f, 2.5f);
        i.lineTo(17.0f, 11.0f);
        uf.x(i, -3.5f, -3.5f, 10.0f);
        i.moveTo(12.0f, 1.0f);
        i.curveTo(5.9f, 1.0f, 1.0f, 5.9f, 1.0f, 12.0f);
        i.reflectiveCurveToRelative(4.9f, 11.0f, 11.0f, 11.0f);
        i.reflectiveCurveToRelative(11.0f, -4.9f, 11.0f, -11.0f);
        i.reflectiveCurveTo(18.1f, 1.0f, 12.0f, 1.0f);
        k4.x(i, 20.31f, 12.0f, -8.34f, 8.37f);
        i.lineTo(3.62f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 8.34f, -8.37f, 20.31f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assistantDirection = build;
        build.getClass();
        return build;
    }
}
