package androidx.compose.material3;

import androidx.compose.material3.tokens.DragHandleTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VerticalDragHandleDefaults {
    public static final int $stable = 0;
    public static final VerticalDragHandleDefaults INSTANCE = new VerticalDragHandleDefaults();
    private static final DragHandleSizes sizes;

    static {
        DragHandleTokens dragHandleTokens = DragHandleTokens.INSTANCE;
        sizes = new DragHandleSizes(DpKt.m7633DpSizeYgX7TsA(dragHandleTokens.m3241getWidthD9Ej5fM(), dragHandleTokens.m3237getHeightD9Ej5fM()), DpKt.m7633DpSizeYgX7TsA(dragHandleTokens.m3240getPressedWidthD9Ej5fM(), dragHandleTokens.m3239getPressedHeightD9Ej5fM()), DpKt.m7633DpSizeYgX7TsA(dragHandleTokens.m3235getDraggedWidthD9Ej5fM(), dragHandleTokens.m3234getDraggedHeightD9Ej5fM()), null);
    }

    private VerticalDragHandleDefaults() {
    }

    private final DragHandleColors getColors(ColorScheme colorScheme) {
        DragHandleColors defaultVerticalDragHandleColorsCached$material3 = colorScheme.getDefaultVerticalDragHandleColorsCached$material3();
        if (defaultVerticalDragHandleColorsCached$material3 != null) {
            return defaultVerticalDragHandleColorsCached$material3;
        }
        DragHandleTokens dragHandleTokens = DragHandleTokens.INSTANCE;
        DragHandleColors dragHandleColors = new DragHandleColors(ColorSchemeKt.fromToken(colorScheme, dragHandleTokens.getColor()), ColorSchemeKt.fromToken(colorScheme, dragHandleTokens.getPressedColor()), ColorSchemeKt.fromToken(colorScheme, dragHandleTokens.getDraggedColor()), null);
        colorScheme.setDefaultVerticalDragHandleColorsCached$material3(dragHandleColors);
        return dragHandleColors;
    }

    private final DragHandleShapes getShapes(Shapes shapes) {
        DragHandleShapes defaultVerticalDragHandleShapesCached$material3 = shapes.getDefaultVerticalDragHandleShapesCached$material3();
        if (defaultVerticalDragHandleShapesCached$material3 != null) {
            return defaultVerticalDragHandleShapesCached$material3;
        }
        DragHandleTokens dragHandleTokens = DragHandleTokens.INSTANCE;
        DragHandleShapes dragHandleShapes = new DragHandleShapes(ShapesKt.fromToken(shapes, dragHandleTokens.getShape()), ShapesKt.fromToken(shapes, dragHandleTokens.getPressedShape()), ShapesKt.fromToken(shapes, dragHandleTokens.getDraggedShape()));
        shapes.setDefaultVerticalDragHandleShapesCached$material3(dragHandleShapes);
        return dragHandleShapes;
    }

    /* renamed from: sizes-L9TjZb0$default, reason: not valid java name */
    public static /* synthetic */ DragHandleSizes m2833sizesL9TjZb0$default(VerticalDragHandleDefaults verticalDragHandleDefaults, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
        }
        return verticalDragHandleDefaults.m2835sizesL9TjZb0(j4, j5, j3);
    }

    public final DragHandleColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1465068453, i, -1, "androidx.compose.material3.VerticalDragHandleDefaults.colors (DragHandle.kt:215)");
        }
        DragHandleColors colors = getColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colors;
    }

    /* renamed from: colors-RGew2ao, reason: not valid java name */
    public final DragHandleColors m2834colorsRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        long m4797getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2062501640, i, -1, "androidx.compose.material3.VerticalDragHandleDefaults.colors (DragHandle.kt:234)");
        }
        DragHandleColors colors = getColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (m4797getUnspecified0d7_KjU == 16) {
            m4797getUnspecified0d7_KjU = colors.m1936getColor0d7_KjU();
        }
        if (m4797getUnspecified0d7_KjU2 == 16) {
            m4797getUnspecified0d7_KjU2 = colors.m1938getPressedColor0d7_KjU();
        }
        if (m4797getUnspecified0d7_KjU3 == 16) {
            m4797getUnspecified0d7_KjU3 = colors.m1937getDraggedColor0d7_KjU();
        }
        DragHandleColors dragHandleColors = new DragHandleColors(m4797getUnspecified0d7_KjU, m4797getUnspecified0d7_KjU2, m4797getUnspecified0d7_KjU3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dragHandleColors;
    }

    public final DragHandleShapes shapes(Shape shape, Shape shape2, Shape shape3, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            shape = null;
        }
        if ((i2 & 2) != 0) {
            shape2 = null;
        }
        if ((i2 & 4) != 0) {
            shape3 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(650848370, i, -1, "androidx.compose.material3.VerticalDragHandleDefaults.shapes (DragHandle.kt:265)");
        }
        DragHandleShapes shapes = getShapes(MaterialTheme.INSTANCE.getShapes(composer, 6));
        if (shape == null) {
            shape = shapes.getShape();
        }
        if (shape2 == null) {
            shape2 = shapes.getPressedShape();
        }
        if (shape3 == null) {
            shape3 = shapes.getDraggedShape();
        }
        DragHandleShapes dragHandleShapes = new DragHandleShapes(shape, shape2, shape3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dragHandleShapes;
    }

    public final DragHandleSizes sizes() {
        return sizes;
    }

    /* renamed from: sizes-L9TjZb0, reason: not valid java name */
    public final DragHandleSizes m2835sizesL9TjZb0(long j, long j2, long j3) {
        DragHandleSizes dragHandleSizes = sizes;
        if (j == InlineClassHelperKt.UnspecifiedPackedFloats) {
            j = dragHandleSizes.m1941getSizeMYxV2XQ();
        }
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            j2 = dragHandleSizes.m1940getPressedSizeMYxV2XQ();
        }
        long j4 = j2;
        if (j3 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            j3 = dragHandleSizes.m1939getDraggedSizeMYxV2XQ();
        }
        return new DragHandleSizes(j, j4, j3, null);
    }

    public final DragHandleShapes shapes(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1385335639, i, -1, "androidx.compose.material3.VerticalDragHandleDefaults.shapes (DragHandle.kt:246)");
        }
        DragHandleShapes shapes = getShapes(MaterialTheme.INSTANCE.getShapes(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shapes;
    }
}
